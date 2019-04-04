package net.henryhc.sustech.javajudge.testcases

import net.henryhc.sustech.javajudge.Compiler
import net.henryhc.sustech.javajudge.sakai.Submission
import net.henryhc.sustech.javajudge.sakai.TestCaseJudgeResult

abstract class TestCase(
        val name: String
) {
    protected val compiler: Compiler = Compiler()
    abstract fun judge(submission: Submission): TestCaseJudgeResult
}
