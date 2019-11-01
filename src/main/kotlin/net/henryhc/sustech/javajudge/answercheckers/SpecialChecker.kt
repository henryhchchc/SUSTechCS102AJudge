package net.henryhc.sustech.javajudge.answercheckers

import net.henryhc.sustech.javajudge.sakai.TestCaseJudgeResult

class SpecialChecker (
        private val input:Any,
    private val tester: (name:String,input:Any,output:Any) -> TestCaseJudgeResult,
    override var caseName: String = ""
) : AnswerChecker {
    override fun check(actual: Any): TestCaseJudgeResult = tester(caseName,input,actual)
}