package net.henryhc.sustech.javajudge.legacy.testcases

import net.henryhc.sustech.javajudge.sakai.Submission
import net.henryhc.sustech.javajudge.sakai.TestCaseJudgeResult

class CompileTestCase(name: String,
                      private val classNamesToCompile: Set<String>) : TestCase(name) {

    override fun judge(submission: Submission): TestCaseJudgeResult {
        val requiredFileNames = classNamesToCompile.map { "$it.java" }.toSet()
        val submittedFileNames = submission.files.map { it.name }.toSet()
        val files = if (classNamesToCompile != ANY_CLASS) {
            if (requiredFileNames.intersect(submittedFileNames) != requiredFileNames) {
                val missingFileNames = requiredFileNames.subtract(submittedFileNames)
                val message = "These files are missing:\n${missingFileNames.joinToString("\n")}"
                return TestCaseJudgeResult(0.0, this.name, message)
            }
            submission.files.filter { it.name in requiredFileNames }
        } else {
            submission.files.filter { it.extension == "java" }
        }
        return when {
            files.isEmpty() -> {
                TestCaseJudgeResult(0.0, this.name, "No .java File found")
            }
            !this.compiler.compile(files) -> {
                TestCaseJudgeResult(0.0, this.name, "Compile failed")
            }
            else -> TestCaseJudgeResult(1.0, this.name, "Success")
        }
    }

    companion object {
        val ANY_CLASS = object : HashSet<String>() {}
    }
}

