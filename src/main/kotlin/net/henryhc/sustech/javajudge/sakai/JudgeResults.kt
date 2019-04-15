package net.henryhc.sustech.javajudge.sakai

import net.henryhc.sustech.javajudge.Problem

data class TestCaseJudgeResult(
        val score: Double,
        val name: String,
        val message: String,
        var stderr: String = ""
) {
    val feedback
        get() = StringBuilder("[$name]\n$message").apply {
            if (stderr.isNotEmpty()) {
                append("\nStderr:\n${stderr.let {
                    if (it.length > 300) it.replaceRange(300..it.length, "...") else it
                }}")
            }
        }.toString()
}


data class ProblemJudgeResult(
        val problem: Problem,
        val score: Double,
        val message: String
) {
    val feedback: String
        get() {
            return "====================\n" +
                    "${this.problem.name}\n" +
                    "====================\n" +
                    "${this.message}\n"
        }
}

data class SubmissionJudgeResult(
        val submission: Submission,
        val problemResultsWithWeight: Map<ProblemJudgeResult, Double>
) {
    val score
        get() = (problemResultsWithWeight
                .map { it.key.score * it.value }.sum() * (if (submission.isLateSubmission) 0.5 else 1.0)
                ).clip(0.0, 100.0)
    val feedback get() = problemResultsWithWeight.map { it.key.feedback }.joinToString("\n\n")
}

fun Double.clip(lowerBound: Double, upperBound: Double) = when {
    this < lowerBound -> lowerBound
    this > upperBound -> upperBound
    else -> this
}