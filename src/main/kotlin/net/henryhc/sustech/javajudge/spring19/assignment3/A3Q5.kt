package net.henryhc.sustech.javajudge.spring19.assignment3

import net.henryhc.sustech.javajudge.Problem
import net.henryhc.sustech.javajudge.testcases.StdinTestCase
import net.henryhc.sustech.javajudge.testCases
import net.henryhc.sustech.javajudge.worth



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

val a3q5 = Problem("A3Q5", testCases(
        StdinTestCase("Case 1", "A3Q5", matrixWithSize(m1), "9") worth 0.25,
        StdinTestCase("Case 2", "A3Q5", matrixWithSize(m2), "18") worth 0.25,
        StdinTestCase("Case 3", "A3Q5", matrixWithSize(m3), "18") worth 0.25,
        StdinTestCase("Case 4", "A3Q5", matrixWithSize(m4), "0") worth 0.25
))