package net.henryhc.sustech.javajudge.spring19.assignment3

import net.henryhc.sustech.javajudge.Problem
import net.henryhc.sustech.javajudge.TestCases.StdinTestCase
import net.henryhc.sustech.javajudge.testCases
import net.henryhc.sustech.javajudge.worth

private val m1 = arrayOf(
        (1..5).toList().toTypedArray(),
        (6..10).toList().toTypedArray(),
        (11..15).toList().toTypedArray(),
        (16..20).toList().toTypedArray(),
        (21..25).toList().toTypedArray()
)

private fun a3q4Input(matrix: Array<Array<Int>>, vararg queries: String) = "${matrix.size} ${matrix[0].size}\n${matrixString(matrix)}\n${queries.size}\n${queries.joinToString("\n")}"

val a3q4 = Problem("A3Q4", testCases(
        StdinTestCase("Case 1", "A3Q4",
                a3q4Input(m1, "2 1 3 3", "1 1 2 2", "2 1 2 4", "2 2 3 2", "1 1 1 1"),
                "93\n40\n54\n31\n7") worth 0.2,
        StdinTestCase("Case 2", "A3Q4",
                a3q4Input(m1, "2 1 3 3", "1 1 2 2", "2 1 2 4"),
                "93\n40\n54") worth 0.2,
        StdinTestCase("Case 3", "A3Q4",
                a3q4Input(m1, "2 1 2 4", "2 2 3 2", "1 1 1 1"),
                "54\n31\n7") worth 0.2,
        StdinTestCase("Case 4", "A3Q4",
                a3q4Input(m1, "2 2 3 2", "1 1 1 1"),
                "31\n7") worth 0.2,
        StdinTestCase("Case 5", "A3Q4",
                a3q4Input(m1, "1 1 1 1"),
                "7") worth 0.2
))