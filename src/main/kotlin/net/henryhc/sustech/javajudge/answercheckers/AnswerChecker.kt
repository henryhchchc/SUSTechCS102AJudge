package net.henryhc.sustech.javajudge.answercheckers

import net.henryhc.sustech.javajudge.sakai.TestCaseJudgeResult

interface AnswerChecker {
    fun check(actual: String): TestCaseJudgeResult
    var caseName: String
}