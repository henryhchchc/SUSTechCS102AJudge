package net.henryhc.sustech.javajudge.legacy.testcases

import net.henryhc.sustech.javajudge.sakai.Submission
import net.henryhc.sustech.javajudge.sakai.TestCaseJudgeResult

class BaseScoreTestCase(name: String) : TestCase(name) {
    override fun judge(submission: Submission): TestCaseJudgeResult {
        return TestCaseJudgeResult(1.0, this.name, "Base score")
    }
}