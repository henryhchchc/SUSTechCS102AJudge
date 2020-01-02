package net.henryhc.sustech.javajudge.fall19.cs309.refactorassignment

import net.henryhc.sustech.javajudge.legacy.problems
import net.henryhc.sustech.javajudge.legacy.testCasesAverage
import net.henryhc.sustech.javajudge.legacy.testcases.CompileTestCase
import net.henryhc.sustech.javajudge.legacy.testcases.BaseScoreTestCase
import net.henryhc.sustech.javajudge.legacy.testcases.unittest.JUnitTestCase
import net.henryhc.sustech.javajudge.legacy.worth
import net.henryhc.sustech.javajudge.sakai.Problem


private val baseScore  = Problem("Base score", testCasesAverage(BaseScoreTestCase("Base Score 25 pt")))

private val compilationProblem = Problem("Compilation (not counted for score)", testCasesAverage(
        CompileTestCase("Compilation", CompileTestCase.ANY_CLASS)

))

private val standardProblem = Problem("Standard", testCasesAverage(
        JUnitTestCase("Standard test cases", "A5Test")
))

val refactorProblems = problems(
        baseScore worth 25.0,
        compilationProblem worth 0.0,
        standardProblem worth 75.0
)
