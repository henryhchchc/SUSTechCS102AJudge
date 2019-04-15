package net.henryhc.sustech.javajudge.spring19.assignment3

import net.henryhc.sustech.javajudge.Problem
import net.henryhc.sustech.javajudge.answercheckers.ExactMatchChecker
import net.henryhc.sustech.javajudge.testcases.StdinTestCase
import net.henryhc.sustech.javajudge.testCases
import net.henryhc.sustech.javajudge.testCasesAverage
import net.henryhc.sustech.javajudge.worth

private val m1 = arrayOf(
        (1..5).toList().toTypedArray(),
        (6..10).toList().toTypedArray(),
        (11..15).toList().toTypedArray(),
        (16..20).toList().toTypedArray(),
        (21..25).toList().toTypedArray()
)

private val m2 = arrayOf(
        arrayOf(33, 44, 12, 42, 145, 333),
        arrayOf(234, 56, 321, 22, 33, 321),
        arrayOf(64, 214, 321, 233, 42, 213),
        arrayOf(44, 3, 2, 1, 4, 22),
        arrayOf(4, 3, 22, 11, 76, 1)
)

private fun a3q4Input(matrix: Array<Array<Int>>, vararg queries: String) =
        "${matrix.size} ${matrix[0].size}\n${matrixString(matrix)}\n${queries.size}\n${queries.joinToString("\n")}"

val a3q4 = Problem("A3Q4", testCasesAverage(
        StdinTestCase("Matrix 1, 5 queries", "A3Q4",
                a3q4Input(m1, "2 1 3 3", "1 1 2 2", "2 1 2 4", "2 2 3 2", "1 1 1 1"),
                ExactMatchChecker("93\n40\n54\n31\n7")),

        StdinTestCase("Matrix 1, 3 queries", "A3Q4",
                a3q4Input(m1, "2 1 3 3", "1 1 2 2", "2 1 2 4"),
                ExactMatchChecker("93\n40\n54")),

        StdinTestCase("Matrix 1, 3 queries v2", "A3Q4",
                a3q4Input(m1, "2 1 2 4", "2 2 3 2", "1 1 1 1"),
                ExactMatchChecker("54\n31\n7")),

        StdinTestCase("Matrix 1, 2 queries", "A3Q4",
                a3q4Input(m1, "2 2 3 2", "1 1 1 1"),
                ExactMatchChecker("31\n7")),

        StdinTestCase("Matrix 1, 1 query", "A3Q4",
                a3q4Input(m1, "1 1 1 1"),
                ExactMatchChecker("7")),

        StdinTestCase("Matrix 2, 20 queries", "A3Q3",
                a3q4Input(m2, "0 0 0 1", "0 0 1 0", "1 1 2 3", "1 1 2 2", "1 2 4 5",
                        "2 1 4 5", "1 3 3 5", "1 3 4 3", "1 0 1 4", "1 3 2 4",
                        "2 4 4 4", "1 3 2 4", "4 4 4 5", "4 1 4 2", "4 1 4 3",
                        "2 2 2 3", "2 2 2 2", "0 0 4 5", "0 1 0 4", "3 3 3 4"),
                ExactMatchChecker(
                        "77\n267\n1167\n912\n1645\n1168\n891\n267\n666\n330\n" +
                                "122\n330\n77\n25\n36\n554\n321\n2876\n243\n5"
                )
        ),

        StdinTestCase("Matrix 2, 10 queries", "A3Q3",
                a3q4Input(m2, "0 0 0 1", "0 0 1 0", "1 1 2 3", "1 1 2 2", "1 2 4 5",
                        "2 1 4 5", "1 3 3 5", "1 3 4 3", "1 0 1 4", "1 3 2 4"),
                ExactMatchChecker("77\n267\n1167\n912\n1645\n1168\n891\n267\n666\n330")
        ),

        StdinTestCase("Matrix 2, 10 queries v2", "A3Q3",
                a3q4Input(m2, "2 4 4 4", "1 3 2 4", "4 4 4 5", "4 1 4 2", "4 1 4 3",
                        "2 2 2 3", "2 2 2 2", "0 0 4 5", "0 1 0 4", "3 3 3 4"),
                ExactMatchChecker("122\n330\n77\n25\n36\n554\n321\n2876\n243\n5")
        )
))
