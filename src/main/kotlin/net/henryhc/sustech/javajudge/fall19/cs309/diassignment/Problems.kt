package net.henryhc.sustech.javajudge.fall19.cs309.diassignment

import net.henryhc.sustech.javajudge.legacy.problems
import net.henryhc.sustech.javajudge.sakai.Problem
import net.henryhc.sustech.javajudge.legacy.testCases
import net.henryhc.sustech.javajudge.legacy.testCasesAverage
import net.henryhc.sustech.javajudge.legacy.testcases.CompileTestCase
import net.henryhc.sustech.javajudge.legacy.testcases.unittest.JUnitTestCase
import net.henryhc.sustech.javajudge.legacy.worth

private val compilationProblem = Problem("Compilation (not counted for score)", testCases(
        CompileTestCase("Compilation", setOf("ContainerImpl")) worth 1.0

))

private val standardProblem  = Problem("Standard", testCasesAverage(
        JUnitTestCase("Standard test cases", "cn.edu.sustech.ContainerImplStandardTest")
))

private val bonusProblem  = Problem("Bonus", testCasesAverage(
        JUnitTestCase("Test cases involving @Inject", "cn.edu.sustech.ContainerImplBonusTest")
))

val problemsDi = problems(
        compilationProblem worth 0.0,
        standardProblem worth 100.0,
        bonusProblem worth 10.0
)
