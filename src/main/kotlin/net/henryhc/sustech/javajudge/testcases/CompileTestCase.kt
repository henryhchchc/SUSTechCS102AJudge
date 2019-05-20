package net.henryhc.sustech.javajudge.testcases

import net.henryhc.sustech.javajudge.sakai.Submission
import net.henryhc.sustech.javajudge.sakai.TestCaseJudgeResult

class CompileTestCase(name: String,
                      private val classNamesToCompile: Set<String>) : TestCase(name) {

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
        return TestCaseJudgeResult(1.0, this.name, "Success")
    }
}

