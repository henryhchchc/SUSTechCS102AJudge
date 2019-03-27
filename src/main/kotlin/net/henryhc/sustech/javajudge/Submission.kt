package net.henryhc.sustech.javajudge

import java.io.File
import java.util.*


class Submission(
        val path: String,
        val student: StudentInfo,
        val isLateSubmission: Boolean,
        val timeStampStr: String
) {
    fun judge(problemsWithScore: Map<Problem, Double>): SubmissionJudgeResult {
        println("Judging ${this.student.name}")
        return SubmissionJudgeResult(
                this,
                problemsWithScore.map { it.key.judge(this) to it.value }.toMap()
        )
    }

    fun writeFeedback(feedback: String) {
        File(path, FeedbackFileName).writeText("<code>\n$feedback\n</code>", Charsets.UTF_8)
    }

    val files = File(this.path, AttachmentsFolderName).listFiles()

    companion object {
        private const val AttachmentsFolderName: String = "提交作业的附件"
        private const val FeedbackFileName: String = "comments.txt"
    }
}
