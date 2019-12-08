package net.henryhc.sustech.javajudge.legacy.testcases

import net.henryhc.sustech.javajudge.legacy.Compiler
import net.henryhc.sustech.javajudge.sakai.Submission
import net.henryhc.sustech.javajudge.sakai.TestCaseJudgeResult

abstract class TestCase(
        val name: String
) {
    protected val compiler: Compiler = Compiler()
    abstract fun judge(submission: Submission): TestCaseJudgeResult
}
