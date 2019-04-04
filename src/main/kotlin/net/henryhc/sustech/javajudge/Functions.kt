package net.henryhc.sustech.javajudge

import net.henryhc.sustech.javajudge.testcases.TestCase

infix fun TestCase.worth(score: Double) = this to score
infix fun Problem.worth(score: Double) = this to score

fun testCases(vararg testCases: Pair<TestCase, Double>) = mapOf(*testCases)
fun problems(vararg problems: Pair<Problem, Double>) = mapOf(*problems)

