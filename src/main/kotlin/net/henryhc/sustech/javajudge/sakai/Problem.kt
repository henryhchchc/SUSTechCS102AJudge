package net.henryhc.sustech.javajudge.sakai

import net.henryhc.sustech.javajudge.legacy.testcases.TestCase

class Problem(
        val name: String,
        private val testCasesScoresMap: Map<TestCase, Double> = emptyMap()
) {
    fun judge(submission: Submission): ProblemJudgeResult {
        val testCaseResults = testCasesScoresMap.map { it.key.judge(submission) to it.value }.toMap()
        val score = testCaseResults.map { it.key.score * it.value }.sum()
        return ProblemJudgeResult(this, score,
                testCaseResults.map { it.key.feedback }.joinToString("\n----------\n"))
    }
}