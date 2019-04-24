package net.henryhc.sustech.javajudge.sakai

import net.henryhc.sustech.javajudge.Problem
import net.henryhc.sustech.javajudge.sakaiI18n
import java.io.File


class Submission(
        val path: String,
        val student: StudentInfo,
        val isLateSubmission: Boolean,
        val timeStampStr: String
) {
    private val i18n = sakaiI18n

    fun judge(problemsWithScore: Map<Problem, Double>, beforeJudge: (Submission) -> Unit = {}): SubmissionJudgeResult {
        beforeJudge(this)
        return SubmissionJudgeResult(
                this,
                problemsWithScore.map { it.key.judge(this) to it.value }.toMap()
        )
    }

    fun writeFeedback(feedback: String) {
        File(path, FeedbackFileName).writeText(
                "<code>$feedback</code>".replace(" ", "&nbsp;"),
                Charsets.UTF_8
        )
    }

    val attachementDirectory = File(this.path, i18n.submissionAttachmentFolderName)
    val files = attachementDirectory.listFiles()

    companion object {
        private const val FeedbackFileName: String = "comments.txt"
    }
}
