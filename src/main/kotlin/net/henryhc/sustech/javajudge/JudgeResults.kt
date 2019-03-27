package net.henryhc.sustech.javajudge

data class TestCaseJudgeResult(
        val score: Double,
        val feedback: String
)

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
        get() = problemResultsWithWeight
                .map { it.key.score * it.value }.sum() * (if (submission.isLateSubmission) 0.5 else 1.0)
                .clip(0.0, 100.0)
    val feedback get() = problemResultsWithWeight.map { it.key.feedback }.joinToString("\n\n")
}

fun Double.clip(lowerBound: Double, upperBound: Double) = when {
    this < lowerBound -> lowerBound
    this > upperBound -> upperBound
    else -> this
}