package net.henryhc.sustech.javajudge.spring19.assignment3

import net.henryhc.sustech.javajudge.Problem
import net.henryhc.sustech.javajudge.answercheckers.ExactMatchChecker
import net.henryhc.sustech.javajudge.testcases.StdinTestCase
import net.henryhc.sustech.javajudge.testCases
import net.henryhc.sustech.javajudge.worth

val a3q2 = Problem("A3Q2", testCases(
        StdinTestCase("Case 1", "A3Q2", "11\n1 3 2 1 4 3 4 0 2 1 0", ExactMatchChecker("6")) worth 0.5,
        StdinTestCase("Case 2", "A3Q2", "16\n3 4 5 2 3 1 4 5 6 4 3 1 2 8 3 5", ExactMatchChecker("26")) worth 0.5
))