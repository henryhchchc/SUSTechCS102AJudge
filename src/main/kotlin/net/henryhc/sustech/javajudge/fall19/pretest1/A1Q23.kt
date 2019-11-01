package net.henryhc.sustech.javajudge.fall19.pretest1

import net.henryhc.sustech.javajudge.answercheckers.ExactMatchChecker
import net.henryhc.sustech.javajudge.sakai.Problem
import net.henryhc.sustech.javajudge.testCases
import net.henryhc.sustech.javajudge.testcases.io.StdinTestCase
import net.henryhc.sustech.javajudge.worth

val q2c1 = "12 30 37\n13 50 29"

val q2c2 = "12 30 37\n13 50 37"

val q2c3 = "12 30 37\n12 30 37"

val q2a1 = "79m52s"

val q2a2 = "80m"

val q2a3 = "0s"

val a1q2 = Problem("A1Q2", testCases(
        StdinTestCase("Case 1", "A1Q2", q2c1, ExactMatchChecker(q2a1)) worth 1.0/3,
        StdinTestCase("Case 2", "A1Q2", q2c2, ExactMatchChecker(q2a2)) worth 1.0/3,
        StdinTestCase("Case 3", "A1Q2", q2c3, ExactMatchChecker(q2a3)) worth 1.0/3
))

val q3c1 = "49.9 1\n9.9 2\n29.9 0.5\n59.9 1.5"

val q3a1 = "176.6"

val a1q3 = Problem("A1Q3", testCases(
        StdinTestCase("Case 1", "A1Q3", q3c1, ExactMatchChecker(q3a1)) worth 1.0
))