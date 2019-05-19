package net.henryhc.sustech.javajudge.spring19.assignment5

import net.henryhc.sustech.javajudge.*
import net.henryhc.sustech.javajudge.testcases.CompileTestCase

private val compileProblem = Problem("Compilation", testCasesAverage(
        CompileTestCase("Gender", setOf("Gender")),
        CompileTestCase("Customer and Gender", setOf("Customer", "Gender")),
        CompileTestCase("BankAccount, Customer and Gender", setOf("BankAccount", "Customer", "Gender")),
        CompileTestCase("All files", setOf("BankAccount", "BankService", "Customer", "Gender"))
))

val problemsAssignment5 = problems(
        compileProblem worth 30.00,
        unitTestJudge worth 90.0
)
