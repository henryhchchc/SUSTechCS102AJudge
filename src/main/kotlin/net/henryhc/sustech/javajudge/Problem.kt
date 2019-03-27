package net.henryhc.sustech.javajudge

class Problem(
        val name: String,
        val testCasesScores: Map<TestCase, Double> = emptyMap()
) {
    fun judge(submission: Submission): ProblemJudgeResult {
        val testCaseResults = testCasesScores.map { it.key.judge(submission) to it.value }.toMap()
        val score = testCaseResults.map { it.key.score * it.value }.sum()
        return ProblemJudgeResult(this, score,
                testCaseResults.map { it.key.feedback }.joinToString("\n----------\n"))
    }
}