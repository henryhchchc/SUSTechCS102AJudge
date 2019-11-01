package net.henryhc.sustech.javajudge.answercheckers

import net.henryhc.sustech.javajudge.sakai.TestCaseJudgeResult
import java.util.*

class ArrayChecker(
        private val expected: Array<*>,
        override var caseName: String = ""
) : AnswerChecker {
    override fun check(actual: Any): TestCaseJudgeResult {
        val actualArray = actual as Array<*>
        return if (actualArray contentDeepEquals expected)
            TestCaseJudgeResult(1.0, caseName, "Nice Work")
        else
            TestCaseJudgeResult(0.0, caseName, "Wrong answer\nExpected:\n${Arrays.deepToString(expected)}\nActual:\n${Arrays.deepToString(actual)}")
    }
}