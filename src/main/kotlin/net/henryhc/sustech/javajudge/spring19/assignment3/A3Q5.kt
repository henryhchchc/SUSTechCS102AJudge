package net.henryhc.sustech.javajudge.spring19.assignment3

import net.henryhc.sustech.javajudge.sakai.Problem
import net.henryhc.sustech.javajudge.answercheckers.ExactMatchChecker
import net.henryhc.sustech.javajudge.testcases.io.StdinTestCase
import net.henryhc.sustech.javajudge.testCasesAverage


private val m1 = arrayOf(
        arrayOf(1, 1, 1, 1, 1, 0),
        arrayOf(0, 0, 0, 0, 1, 0),
        arrayOf(0, 0, 0, 0, 1, 0),
        arrayOf(0, 1, 1, 1, 0, 0),
        arrayOf(0, 1, 1, 1, 0, 0),
        arrayOf(0, 1, 1, 1, 0, 0)
)

private val m2 = arrayOf(
        arrayOf(1, 0, 1, 1, 1, 0),
        arrayOf(1, 0, 1, 0, 1, 0),
        arrayOf(1, 0, 1, 0, 1, 0),
        arrayOf(1, 0, 1, 0, 1, 0),
        arrayOf(1, 1, 1, 0, 1, 1),
        arrayOf(0, 0, 0, 0, 0, 0)
)


private val m3 = arrayOf(
        arrayOf(1, 1, 1, 1, 1, 0),
        arrayOf(0, 0, 0, 0, 1, 0),
        arrayOf(1, 1, 1, 1, 1, 0),
        arrayOf(1, 0, 0, 0, 0, 0),
        arrayOf(1, 1, 1, 1, 1, 1),
        arrayOf(0, 0, 0, 0, 0, 0)
)

private val m4 = arrayOf(
        arrayOf(0, 0, 0, 0, 0, 0),
        arrayOf(0, 0, 0, 0, 0, 0),
        arrayOf(0, 0, 0, 0, 0, 0),
        arrayOf(0, 0, 0, 0, 0, 0),
        arrayOf(0, 0, 0, 0, 0, 0),
        arrayOf(0, 0, 0, 0, 0, 0)
)

private val m5 = arrayOf(
        arrayOf(1, 0),
        arrayOf(0, 1)
)

private val m6 = arrayOf(
        arrayOf(0, 0, 0, 0, 0),
        arrayOf(0, 1, 1, 1, 0),
        arrayOf(0, 1, 0, 1, 0),
        arrayOf(0, 1, 1, 1, 0)
)

private val m7 = arrayOf(
        arrayOf(0, 0, 0, 0, 0, 0, 0, 0),
        arrayOf(1, 1, 1, 1, 1, 0, 1, 1),
        arrayOf(0, 1, 1, 1, 1, 1, 1, 0),
        arrayOf(0, 0, 0, 0, 0, 0, 0, 1),
        arrayOf(0, 0, 0, 0, 0, 0, 1, 1),
        arrayOf(1, 1, 1, 1, 1, 1, 1, 1),
        arrayOf(0, 0, 0, 0, 0, 0, 1, 0),
        arrayOf(1, 1, 1, 1, 1, 0, 0, 0)
)

private val m8 = arrayOf(
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

private val m9 = arrayOf(
        arrayOf(0, 1, 1, 1, 1, 1, 0),
        arrayOf(1, 0, 0, 0, 0, 0, 1),
        arrayOf(1, 0, 0, 0, 0, 0, 1),
        arrayOf(0, 1, 1, 1, 1, 1, 0)
)

private val m10 = arrayOf(
        arrayOf(0, 0, 0, 0, 0, 0, 0),
        arrayOf(0, 0, 0, 1, 0, 0, 0),
        arrayOf(0, 1, 1, 1, 1, 1, 0),
        arrayOf(0, 0, 0, 1, 0, 0, 0),
        arrayOf(0, 0, 0, 0, 0, 0, 0)
)


val a3q5 = Problem("A3Q5", testCasesAverage(
        StdinTestCase("Case 1", "A3Q5", matrixWithSize(m1), ExactMatchChecker("9")),
        StdinTestCase("Case 2", "A3Q5", matrixWithSize(m2), ExactMatchChecker("18")),
        StdinTestCase("Case 3", "A3Q5", matrixWithSize(m3), ExactMatchChecker("18")),
        StdinTestCase("Case 4", "A3Q5", matrixWithSize(m4), ExactMatchChecker("0")),
        StdinTestCase("Case 5", "A3Q5", matrixWithSize(m5), ExactMatchChecker("1")),
        StdinTestCase("Case 6", "A3Q5", matrixWithSize(m6), ExactMatchChecker("8")),
        StdinTestCase("Case 7", "A3Q5", matrixWithSize(m7), ExactMatchChecker("13")),
        StdinTestCase("Case 8", "A3Q5", matrixWithSize(m8), ExactMatchChecker("20")),
        StdinTestCase("Case 9", "A3Q5", matrixWithSize(m9), ExactMatchChecker("5")),
        StdinTestCase("Case 10", "A3Q5", matrixWithSize(m10), ExactMatchChecker("7"))
))