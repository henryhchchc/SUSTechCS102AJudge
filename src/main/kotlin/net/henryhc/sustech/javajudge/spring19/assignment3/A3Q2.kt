package net.henryhc.sustech.javajudge.spring19.assignment3

import net.henryhc.sustech.javajudge.sakai.Problem
import net.henryhc.sustech.javajudge.answercheckers.ExactMatchChecker
import net.henryhc.sustech.javajudge.legacy.testcases.io.StdinTestCase
import net.henryhc.sustech.javajudge.legacy.testCasesAverage

val a3q2 = Problem("A3Q2", testCasesAverage(
        StdinTestCase("Case 1", "A3Q2", "11\n1 3 2 1 4 3 4 0 2 1 0", ExactMatchChecker("6")),
        StdinTestCase("Case 2", "A3Q2", "16\n3 4 5 2 3 1 4 5 6 4 3 1 2 8 3 5", ExactMatchChecker("26")),
        StdinTestCase("Case 3", "A3Q2", "9\n3 2 1 2 3 2 1 2 3", ExactMatchChecker("8")),
        StdinTestCase("Case 4", "A3Q2", "19\n1 2 3 4 3 2 3 1 2 3 4 2 3 2 1 2 3 2 1", ExactMatchChecker("15")),
        StdinTestCase("Case 5", "A3Q2", "9\n1 2 3 4 5 6 7 8 9", ExactMatchChecker("0"))
))
