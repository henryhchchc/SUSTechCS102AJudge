package net.henryhc.sustech.javajudge.answercheckers

import net.henryhc.sustech.javajudge.sakai.TestCaseJudgeResult

class RangeChecker(
        private val a: Double,
        private val b: Double,
        override var caseName: String = ""
) : AnswerChecker {
    override fun check(actual: Any): TestCaseJudgeResult =
            if (actual.toString().toDouble() in a..b) TestCaseJudgeResult(1.0, caseName, "Nice Work")
            else TestCaseJudgeResult(0.0, caseName, "Wrong answer\nExpected Range:[$a, $b]\n\nActual:\n${actual.toString().toDouble()}")
}