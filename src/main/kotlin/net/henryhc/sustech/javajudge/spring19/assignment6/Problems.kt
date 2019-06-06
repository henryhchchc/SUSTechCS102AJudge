package net.henryhc.sustech.javajudge.spring19.assignment6

import net.henryhc.sustech.javajudge.*
import net.henryhc.sustech.javajudge.sakai.Problem
import net.henryhc.sustech.javajudge.testcases.CompileTestCase
import net.henryhc.sustech.javajudge.testcases.filemarker.FileMarkerTestCase
import net.henryhc.sustech.javajudge.testcases.unittest.JUnitStandaloneTestCase

private val compileProblem = Problem("Compilation (Not counted for score)", testCasesAverage(
        CompileTestCase("All files", setOf("ConcreteHotel", "Day", "Hotel", "LuxuryRoom", "OrdinaryRoom", "Room"))
))

private val manualFixPenalty = Problem("Manual fix penalty", testCasesAverage(
        FileMarkerTestCase("Fix 1", "fix",
                "Fixed, -10 penalty", "No fix, no penalty",
                presentScore = 1.0, notPresentScore = 0.0)
))

private val unitTestJudge = Problem("Unit test judge", testCases(
        JUnitStandaloneTestCase("JUnit provided by Ms. Zhu", "A6Test") worth 1.0
))

val problemsAssignment6 = problems(
        compileProblem worth 0.00,
        unitTestJudge worth 120.0,
        manualFixPenalty worth -10.0
)
