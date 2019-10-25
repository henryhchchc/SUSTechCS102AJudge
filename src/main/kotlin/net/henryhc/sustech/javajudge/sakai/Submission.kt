package net.henryhc.sustech.javajudge.sakai

import net.henryhc.sustech.javajudge.sakaiI18n
import java.io.File


class Submission(
        private val path: String,
        val student: StudentInfo,
        val isLateSubmission: Boolean,
        val timeStampStr: String
) {
    private val i18n = sakaiI18n

    fun judge(problemsWithScore: Map<Problem, Double>, beforeJudge: (Submission) -> Unit = {}) =
            beforeJudge(this).run {
                SubmissionJudgeResult(
                        this@Submission,
                        problemsWithScore.map { it.key.judge(this@Submission) to it.value }.toMap()
                )
            }

    fun writeFeedback(feedback: String, score: String) = File(path, FeedbackFileName).writeText(
            "<span style=\"color: red;\">Your Score is $score</span>\n<code>$feedback</code>".replace(" ", "&nbsp;"),
            Charsets.UTF_8
    )

    val attachmentsDirectory = File(this.path, i18n.submissionAttachmentFolderName)
    val files: Array<File> = attachmentsDirectory.listFiles() ?: emptyArray()

    companion object {
        private const val FeedbackFileName: String = "comments.txt"
    }
}
