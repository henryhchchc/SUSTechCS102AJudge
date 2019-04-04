package net.henryhc.sustech.javajudge.spring19.assignment3

import net.henryhc.sustech.javajudge.Problem
import net.henryhc.sustech.javajudge.testcases.StdinTestCase
import net.henryhc.sustech.javajudge.testCases
import net.henryhc.sustech.javajudge.worth

private fun a3q1Input(vararg matrices: Array<Array<Int>>) = "${matrices.size}\n${matrices.joinToString("\n") {
    "${it.size} ${it[0].size}\n${matrixString(it)}"
}}"

private val m1 = arrayOf(
        arrayOf(1, 1, 1, 1),
        arrayOf(2, 2, 3, 3),
        arrayOf(4, 5, 4, 4),
        arrayOf(4, 5, 5, 5)
)
private val m2 = arrayOf(
        arrayOf(2, 2),
        arrayOf(2, 2),
        arrayOf(2, 2)
)

private val m3 = arrayOf(
        arrayOf(2, 4, 6),
        arrayOf(4, 4, 6),
        arrayOf(8, 2, 9)
)

val a3q1 = Problem("A3Q1", testCases(
        StdinTestCase("Case 1", "A3Q1", a3q1Input(m1, m2, m3), "1 1 1 1\n2 2\n2 2 3") worth 0.25,
        StdinTestCase("Case 2", "A3Q1", a3q1Input(m1), "1 1 1 1") worth 0.25,
        StdinTestCase("Case 3", "A3Q1", a3q1Input(m2), "2 2") worth 0.25,
        StdinTestCase("Case 4", "A3Q1", a3q1Input(m3), "2 2 3") worth 0.25
))