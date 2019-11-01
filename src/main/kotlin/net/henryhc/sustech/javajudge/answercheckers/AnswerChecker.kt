package net.henryhc.sustech.javajudge.answercheckers

import net.henryhc.sustech.javajudge.sakai.TestCaseJudgeResult
import java.util.*

interface AnswerChecker {
    fun check(actual: Any): TestCaseJudgeResult
    var caseName: String
}