package net.henryhc.sustech.javajudge.spring19.assignment5

import net.henryhc.sustech.javajudge.*
import net.henryhc.sustech.javajudge.testcases.CompileTestCase
import net.henryhc.sustech.javajudge.testcases.filemarker.FileMarkerTestCase

private val compileProblem = Problem("Compilation (Not counted for score)", testCasesAverage(
        CompileTestCase("All files", setOf("BankAccount", "BankService", "Customer", "Gender"))
))

private val manualFixPenalty = Problem("Manual fix penalty", testCasesAverage(
        FileMarkerTestCase("Compile fix", "fix",
                "Fixed compile error", "No fix needed",
                presentScore = 1.0, notPresentScore = 0.0)
))

val problemsAssignment5 = problems(
        compileProblem worth 0.00,
        unitTestJudge worth 120.0,
        manualFixPenalty worth -10.0
)
