package net.henryhc.sustech.javajudge.answercheckers

import net.henryhc.sustech.javajudge.sakai.TestCaseJudgeResult

class RegexChacker(
        val regex: Regex,
        override var caseName: String = "") : AnswerChecker {
    override fun check(actual: String) =
            if (regex.matches(actual)) TestCaseJudgeResult(1.0, caseName, "Nice Work")
            else TestCaseJudgeResult(0.0, caseName,
                    "Wrong answer\nYour output should match regular expression:\n${regex.pattern}\nActual:$actual")
}