package net.henryhc.sustech.javajudge.testcases.classdesign

import net.henryhc.sustech.javajudge.sakai.Submission
import net.henryhc.sustech.javajudge.sakai.TestCaseJudgeResult
import net.henryhc.sustech.javajudge.testcases.TestCase
import java.net.URLClassLoader

abstract class ReflectionTestCase(
        name: String,
        private val classNamesToCompile: Set<String>,
        private val classNameToCheck: String
) : TestCase(name) {
    override fun judge(submission: Submission): TestCaseJudgeResult {
        val requiredFileNames = classNamesToCompile.map { "$it.java" }.toSet()
        val submittedFileNames = submission.files.map { it.name }.toSet()
        if (requiredFileNames.intersect(submittedFileNames) != requiredFileNames) {
            val missingFileNames = requiredFileNames.subtract(submittedFileNames)
            val message = "These files are missing:\n${missingFileNames.joinToString("\n")}"
            return TestCaseJudgeResult(0.0, this.name, message)
        }
        val files = submission.files.filter { it.name in requiredFileNames }
        if (!this.compiler.compile(files)) {
            return TestCaseJudgeResult(0.0, this.name, "Compile failed")
        }
        return try {
            val clazz = submission.attachmentsDirectory.toURI().toURL()
                    .let { arrayOf(it) }
                    .let { URLClassLoader(it) }
                    .loadClass(classNameToCheck)
            this.checkClass(clazz)
        } catch (ex: NoClassDefFoundError) {
            TestCaseJudgeResult(0.00, this.name, "Class not found.")
        }
    }

    abstract fun checkClass(clazz: Class<*>): TestCaseJudgeResult
}
