package net.henryhc.sustech.javajudge.spring19.assignment3

import net.henryhc.sustech.javajudge.Problem
import net.henryhc.sustech.javajudge.answercheckers.RegexChacker
import net.henryhc.sustech.javajudge.testCasesAverage
import net.henryhc.sustech.javajudge.testcases.io.StdinTestCase

private fun a3q3Checker(matrix: Array<Array<Int>>) = RegexChacker(
        matrix.joinToString("\\n") { it.joinToString("\\s+") { it1 -> it1.toString() } }.toRegex()
)

private fun a3q3Case(caseId: Int, matrix: Array<Array<Int>>) =
        StdinTestCase("Case $caseId", "A3Q3", "${matrix.size} ${matrix[0].size}", a3q3Checker(matrix))


private val m1 = arrayOf(
        arrayOf(3, 2, 1),
        arrayOf(4, 13, 12),
        arrayOf(5, 14, 11),
        arrayOf(6, 15, 10),
        arrayOf(7, 8, 9)
)

private val m2 = arrayOf(
        arrayOf(6, 5, 4, 3, 2, 1),
        arrayOf(7, 20, 19, 18, 17, 16),
        arrayOf(8, 21, 22, 23, 24, 15),
        arrayOf(9, 10, 11, 12, 13, 14)
)

private val m3 = arrayOf(
        arrayOf(7, 6, 5, 4, 3, 2, 1),
        arrayOf(8, 29, 28, 27, 26, 25, 24),
        arrayOf(9, 30, 43, 42, 41, 40, 23),
        arrayOf(10, 31, 44, 49, 48, 39, 22),
        arrayOf(11, 32, 45, 46, 47, 38, 21),
        arrayOf(12, 33, 34, 35, 36, 37, 20),
        arrayOf(13, 14, 15, 16, 17, 18, 19)
)

private val m4 = arrayOf(
        arrayOf(8, 7, 6, 5, 4, 3, 2, 1),
        arrayOf(9, 32, 31, 30, 29, 28, 27, 26),
        arrayOf(10, 33, 48, 47, 46, 45, 44, 25),
        arrayOf(11, 34, 49, 56, 55, 54, 43, 24),
        arrayOf(12, 35, 50, 51, 52, 53, 42, 23),
        arrayOf(13, 36, 37, 38, 39, 40, 41, 22),
        arrayOf(14, 15, 16, 17, 18, 19, 20, 21)
)

private val m5 = arrayOf(
        arrayOf(1),
        arrayOf(2),
        arrayOf(3),
        arrayOf(4),
        arrayOf(5),
        arrayOf(6),
        arrayOf(7),
        arrayOf(8),
        arrayOf(9)
)

val a3q3 = Problem("A3Q3", testCasesAverage(
        a3q3Case(1, m1),
        a3q3Case(2, m2),
        a3q3Case(3, m3),
        a3q3Case(4, m4),
        a3q3Case(5, m5)
))