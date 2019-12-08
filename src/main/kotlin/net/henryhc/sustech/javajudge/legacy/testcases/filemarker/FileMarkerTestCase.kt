package net.henryhc.sustech.javajudge.legacy.testcases.filemarker

import net.henryhc.sustech.javajudge.sakai.Submission
import net.henryhc.sustech.javajudge.sakai.TestCaseJudgeResult
import net.henryhc.sustech.javajudge.legacy.testcases.TestCase

class FileMarkerTestCase(
        name: String,
        val fileName: String,
        val presentFeedback: String,
        val notPresentFeedback: String = "Well Done",
        val presentScore: Double = 0.0,
        val notPresentScore: Double = 1.0
) : TestCase(name) {
    override fun judge(submission: Submission): TestCaseJudgeResult {
        val isPresent = submission.files.any { it.name == fileName }
        return if (isPresent) {
            TestCaseJudgeResult(presentScore, name, presentFeedback)
        } else {
            TestCaseJudgeResult(notPresentScore, name, notPresentFeedback)
        }
    }
}