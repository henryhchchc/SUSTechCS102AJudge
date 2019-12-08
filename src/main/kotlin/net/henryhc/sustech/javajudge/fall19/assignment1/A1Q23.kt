package net.henryhc.sustech.javajudge.fall19.assignment1

import net.henryhc.sustech.javajudge.sakai.Problem
import net.henryhc.sustech.javajudge.answercheckers.ExactMatchChecker
import net.henryhc.sustech.javajudge.legacy.testcases.io.StdinTestCase
import net.henryhc.sustech.javajudge.legacy.testCases
import net.henryhc.sustech.javajudge.legacy.worth

val q2c1 = "12 40 40\n" +
        "12 40 51"

val q2a1 = "11s"

val q2c2 = "11 40 41 \n" +
        "13 40 39"

val q2a2 = "119m58s"

val q2c3 = "11 30 40 \n" +
        "12 40 40"

val q2a3 = "70m"

val q2c4 = "13 29 49 \n" +
        "13 30 40"

val q2a4 = "51s"

val q2c5 = "11 41 42 \n" +
        "12 39 41"

val q2a5 = "57m59s"
//SplitLine!!!!!!!!!!!!!!
val q3c1 = "19.1 2.5\n" +
        "22 1.5\n" +
        "2 0.5\n" +
        "1.6 1"

val q3a1 = "86.4"

val q3c2 = "12.3 0.5\n" +
        "2.9 2\n" +
        "3.3 1.5\n" +
        "2 2"

val q3a2 = "23.0"

val q3c3 = "16.3 1.5\n" +
        "2 0.5\n" +
        "9.8 3\n" +
        "9 2\n" +
        "13.9 3.5"

val q3a3 = "124.6"

val q3c4 = "6.6 3\n" +
        "7.3 3.5\n" +
        "2 2\n" +
        "3.5 5"

val q3a4 = "67.9"

val q3c5 = "0.5 0.5\n" +
        "1.5 1.5\n" +
        "2.5 2.5\n" +
        "3.5 3.5"

val q3a5 = "25.2"

val a1q2 = Problem("A1Q2", testCases(
        StdinTestCase("Case 1", "A1Q2", q2c1, ExactMatchChecker(q2a1)) worth 0.2,
        StdinTestCase("Case 2", "A1Q2", q2c2, ExactMatchChecker(q2a2)) worth 0.2,
        StdinTestCase("Case 3", "A1Q2", q2c3, ExactMatchChecker(q2a3)) worth 0.2,
        StdinTestCase("Case 4", "A1Q2", q2c4, ExactMatchChecker(q2a4)) worth 0.2,
        StdinTestCase("Case 5", "A1Q2", q2c5, ExactMatchChecker(q2a5)) worth 0.2
))

val a1q3 = Problem("A1Q3", testCases(
        StdinTestCase("Case 1", "A1Q3", q3c1, ExactMatchChecker(q3a1)) worth 0.2,
        StdinTestCase("Case 2", "A1Q3", q3c2, ExactMatchChecker(q3a2)) worth 0.2,
        StdinTestCase("Case 3", "A1Q3", q3c3, ExactMatchChecker(q3a3)) worth 0.2,
        StdinTestCase("Case 4", "A1Q3", q3c4, ExactMatchChecker(q3a4)) worth 0.2,
        StdinTestCase("Case 5", "A1Q3", q3c5, ExactMatchChecker(q3a5)) worth 0.2
)
)