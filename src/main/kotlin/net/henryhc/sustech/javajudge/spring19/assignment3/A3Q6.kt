package net.henryhc.sustech.javajudge.spring19.assignment3

import net.henryhc.sustech.javajudge.sakai.Problem
import net.henryhc.sustech.javajudge.answercheckers.ExactMatchChecker
import net.henryhc.sustech.javajudge.legacy.testcases.io.StdinTestCase
import net.henryhc.sustech.javajudge.legacy.testCasesAverage

private val m1 = arrayOf(
        arrayOf(1, 3),
        arrayOf(4, 1)
)

private val m2 = arrayOf(
        arrayOf(2, 4, 5, 4, 1),
        arrayOf(3, 7, 2, 4, 1)
)

private val m3 = arrayOf(
        arrayOf(1, 2, 6),
        arrayOf(3, 5, 7),
        arrayOf(4, 8, 11),
        arrayOf(9, 10, 12)
)

private val m4 = arrayOf(
        arrayOf(1, 3, 4, 9),
        arrayOf(3, 5, 8, 2),
        arrayOf(6, 2, 3, 1)
)
private val m5 = arrayOf(
        arrayOf(2, 2, 3, 5),
        arrayOf(1, 6, 8, 9),
        arrayOf(5, 4, 5, 5),
        arrayOf(5, 3, 8, 2)
)
private val m6 = arrayOf(
        arrayOf(1, 2, 3, 4, 5, 6),
        arrayOf(2, 3, 4, 5, 6, 7),
        arrayOf(3, 4, 5, 6, 7, 8),
        arrayOf(4, 5, 6, 7, 8, 9),
        arrayOf(5, 6, 7, 8, 9, 0)
)
private val m7 = arrayOf(
        arrayOf(0, 1, 1, 1, 1, 1, 0),
        arrayOf(1, 0, 0, 0, 0, 0, 1),
        arrayOf(1, 0, 0, 0, 0, 0, 1),
        arrayOf(0, 1, 1, 1, 1, 1, 0)
)
private val m8 = arrayOf(
        arrayOf(0, 0, 0, 0, 0, 0, 0),
        arrayOf(0, 0, 0, 1, 0, 0, 0),
        arrayOf(0, 1, 1, 1, 1, 1, 0),
        arrayOf(0, 0, 0, 1, 0, 0, 0),
        arrayOf(0, 0, 0, 0, 0, 0, 0)
)
private val m9 = arrayOf(
        arrayOf(1, 1, 1, 1, 0, 0, 1, 1, 0, 0),
        arrayOf(0, 1, 0, 1, 1, 1, 1, 1, 1, 1),
        arrayOf(0, 0, 0, 1, 0, 1, 1, 1, 1, 1),
        arrayOf(1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
        arrayOf(0, 1, 1, 1, 1, 1, 1, 0, 0, 0),
        arrayOf(0, 1, 1, 1, 1, 1, 1, 1, 1, 1),
        arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 1),
        arrayOf(0, 1, 1, 1, 1, 1, 1, 1, 0, 1),
        arrayOf(0, 1, 1, 1, 1, 1, 1, 1, 0, 1),
        arrayOf(0, 0, 0, 0, 0, 1, 0, 0, 0, 0)
)
private val m10 = arrayOf(
        arrayOf(33, 44, 12, 42, 145),
        arrayOf(234, 56, 321, 22, 33),
        arrayOf(64, 214, 321, 233, 42),
        arrayOf(44, 3, 2, 1, 4),
        arrayOf(4, 3, 22, 11, 76)
)
val a3q6 = Problem("A3Q6", testCasesAverage(
        StdinTestCase("Case 1", "A3Q6", matrixWithSize(m1), ExactMatchChecker("5")),
        StdinTestCase("Case 2", "A3Q6", matrixWithSize(m2), ExactMatchChecker("17")),
        StdinTestCase("Case 3", "A3Q6", matrixWithSize(m3), ExactMatchChecker("38")),
        StdinTestCase("Case 4", "A3Q6", matrixWithSize(m4), ExactMatchChecker("15")),
        StdinTestCase("Case 5", "A3Q6", matrixWithSize(m5), ExactMatchChecker("24")),
        StdinTestCase("Case 6", "A3Q6", matrixWithSize(m6), ExactMatchChecker("45")),
        StdinTestCase("Case 7", "A3Q6", matrixWithSize(m7), ExactMatchChecker("2")),
        StdinTestCase("Case 8", "A3Q6", matrixWithSize(m8), ExactMatchChecker("0")),
        StdinTestCase("Case 9", "A3Q6", matrixWithSize(m9), ExactMatchChecker("2")),
        StdinTestCase("Case 10", "A3Q6", matrixWithSize(m10), ExactMatchChecker("308"))
))
