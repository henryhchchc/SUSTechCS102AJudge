package net.henryhc.sustech.javajudge.testcases

import net.henryhc.sustech.javajudge.sakai.Submission
import net.henryhc.sustech.javajudge.sakai.TestCaseJudgeResult
import net.henryhc.sustech.javajudge.TimeLimit
import net.henryhc.sustech.javajudge.programrunners.LocalProgramRunner
import java.util.concurrent.TimeUnit

class ArgsTestCase(
        name: String,
        private val className: String,
        private val args: List<String>,
        private val expected: String
) : TestCase(name) {

    override fun judge(submission: Submission): TestCaseJudgeResult {
        val file = submission.files.singleOrNull {
            it.name == "$className.java"
        } ?: return TestCaseJudgeResult(0.0, "[${this.name}] File $className.java not found")

        if (!compiler.compile(file)) {
            return TestCaseJudgeResult(0.0, "[${this.name}] Compile fail")
        }
        val runner = LocalProgramRunner(file.parentFile, className, TimeLimit, args.toTypedArray())
        if (runner.runWithTimeLimitCheck()) {
            return TestCaseJudgeResult(0.0, "[${this.name}] Time out")
        }
        val output = runner.standoutOutputLines.joinToString("\n") { it.trim() }.trim()
        val error = runner.standardErrorLines.joinToString("\n")
        return if (output == expected)
            TestCaseJudgeResult(1.0, "[${this.name}] Nice Work")
        else TestCaseJudgeResult(0.0,
                "[${this.name}] Wrong answer\nExpected:\n$expected\nActual:\n$output\nStderr:\n$error")
    }

}