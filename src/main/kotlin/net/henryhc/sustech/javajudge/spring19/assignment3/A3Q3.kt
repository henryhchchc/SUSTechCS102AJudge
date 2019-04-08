package net.henryhc.sustech.javajudge.spring19.assignment3

import net.henryhc.sustech.javajudge.Problem
import net.henryhc.sustech.javajudge.answercheckers.RegexChacker
import net.henryhc.sustech.javajudge.testcases.StdinTestCase
import net.henryhc.sustech.javajudge.testCases
import net.henryhc.sustech.javajudge.worth

private fun a3q3Checker(matrix: Array<Array<Int>>) = RegexChacker(
        matrix.joinToString("\\n") { it.joinToString("\\s+") { it1 -> it1.toString() } }.toRegex()
)

private val m1 = arrayOf(
        arrayOf(4, 3, 2, 1),
        arrayOf(5, 14, 13, 12),
        arrayOf(6, 15, 16, 11),
        arrayOf(7, 8, 9, 10)
)

private val m2 = arrayOf(
        arrayOf(3, 2, 1),
        arrayOf(4, 13, 12),
        arrayOf(5, 14, 11),
        arrayOf(6, 15, 10),
        arrayOf(7, 8, 9)
)

private val m3 = arrayOf(
        arrayOf(6, 5, 4, 3, 2, 1),
        arrayOf(7, 20, 19, 18, 17, 16),
        arrayOf(8, 21, 22, 23, 24, 15),
        arrayOf(9, 10, 11, 12, 13, 14)
)

val a3q3 = Problem("A3Q3", testCases(
        StdinTestCase("Case 1", "A3Q3", "4 4", a3q3Checker(m1)) worth 1.0 / 3,
        StdinTestCase("Case 2", "A3Q3", "5 3", a3q3Checker(m2)) worth 1.0 / 3,
        StdinTestCase("Case 3", "A3Q3", "4 6", a3q3Checker(m3)) worth 1.0 / 3
))