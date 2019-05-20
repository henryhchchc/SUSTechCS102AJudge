package net.henryhc.sustech.javajudge.spring19.assignment5

import net.henryhc.sustech.javajudge.*
import net.henryhc.sustech.javajudge.testcases.CompileTestCase

private val compileProblem = Problem("Compilation (Not counted for score)", testCasesAverage(
        CompileTestCase("All files", setOf("BankAccount", "BankService", "Customer", "Gender"))
))

val problemsAssignment5 = problems(
        compileProblem worth 0.00,
        unitTestJudge worth 120.0
)
