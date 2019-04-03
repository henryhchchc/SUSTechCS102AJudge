package net.henryhc.sustech.javajudge.spring19.assignment3

import net.henryhc.sustech.javajudge.Problem
import net.henryhc.sustech.javajudge.TestCases.StdinTestCase
import net.henryhc.sustech.javajudge.testCases
import net.henryhc.sustech.javajudge.worth

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

val a3q6 = Problem("A3Q6", testCases(
        StdinTestCase("Case 1", "A3Q6", matrixWithSize(m1), "5") worth 1.0 / 3,
        StdinTestCase("Case 2", "A3Q6", matrixWithSize(m2), "17") worth 1.0 / 3,
        StdinTestCase("Case 3", "A3Q6", matrixWithSize(m3), "38") worth 1.0 / 3
))
