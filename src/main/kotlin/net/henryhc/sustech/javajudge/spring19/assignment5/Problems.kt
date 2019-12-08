package net.henryhc.sustech.javajudge.spring19.assignment5

import net.henryhc.sustech.javajudge.legacy.problems
import net.henryhc.sustech.javajudge.legacy.testCases
import net.henryhc.sustech.javajudge.legacy.testCasesAverage
import net.henryhc.sustech.javajudge.sakai.Problem
import net.henryhc.sustech.javajudge.legacy.testcases.CompileTestCase
import net.henryhc.sustech.javajudge.legacy.testcases.filemarker.FileMarkerTestCase
import net.henryhc.sustech.javajudge.legacy.testcases.unittest.JUnitTestCase
import net.henryhc.sustech.javajudge.legacy.worth

private val compileProblem = Problem("Compilation (Not counted for score)", testCasesAverage(
        CompileTestCase("All files", setOf("BankAccount", "BankService", "Customer", "Gender"))
))

private val manualFixPenalty = Problem("Manual fix penalty", testCasesAverage(
        FileMarkerTestCase("Fix 1", "fix",
                "Fixed, -10 penalty", "No fix, no penalty",
                presentScore = 1.0, notPresentScore = 0.0)
))

private val unitTestJudge = Problem("Unit test judge", testCases(
        JUnitTestCase("JUnit provided by Prof. Liu", "A5Test") worth 1.0
))

val problemsAssignment5 = problems(
        compileProblem worth 0.00,
        unitTestJudge worth 120.0,
        manualFixPenalty worth -10.0
)
