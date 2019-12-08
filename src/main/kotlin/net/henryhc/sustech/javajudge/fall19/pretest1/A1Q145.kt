package net.henryhc.sustech.javajudge.fall19.pretest1

import net.henryhc.sustech.javajudge.answercheckers.ExactMatchChecker
import net.henryhc.sustech.javajudge.sakai.Problem
import net.henryhc.sustech.javajudge.legacy.testCases
import net.henryhc.sustech.javajudge.legacy.testcases.io.ArgsTestCase
import net.henryhc.sustech.javajudge.legacy.worth


val a1q1 = Problem("A1Q1", testCases(
        ArgsTestCase("Case 1", "A1Q1", listOf("XXX", "11910001"), ExactMatchChecker("XXX, welcome to SUSTECH Hot Pot Restaurant!")) worth 0.5,
        ArgsTestCase("Case 2", "A1Q1", listOf("XXX", "1191001"), ExactMatchChecker("1191001")) worth 0.5
))

val a1q4 = Problem("A1Q4", testCases(
        ArgsTestCase("Case 1", "A1Q4", listOf("1000", "400", "400", "400"), ExactMatchChecker("Silver")) worth 1.0
))

val a1q5 = Problem("A1Q5", testCases(
        ArgsTestCase("Case 1", "A1Q5", listOf("9.9", "12.9", "19.9", "21.9", "33.5", "54.9"), ExactMatchChecker("16.9 59.9")) worth 1.0
))