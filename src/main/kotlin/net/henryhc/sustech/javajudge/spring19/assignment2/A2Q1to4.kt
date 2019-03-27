package net.henryhc.sustech.javajudge.spring19.assignment2

import net.henryhc.sustech.javajudge.Problem
import net.henryhc.sustech.javajudge.TestCases.ArgsTestCase

private fun a2q1Result(year: Int, sb: String, animal: String) = "$year is the year of $sb. Also $animal year."

val a2q1 = Problem("A2Q1", mapOf(
        ArgsTestCase("Case 1", "A2Q1", listOf("2019"),
                a2q1Result(2019, "ji-hai", "Pig")) to 0.25,
        ArgsTestCase("Case 2", "A2Q1", listOf("1898"),
                a2q1Result(1898, "wu-xu", "Dog")) to 0.25,
        ArgsTestCase("Case 3", "A2Q1", listOf("1949"),
                a2q1Result(1949, "ji-chou", "Ox")) to 0.25,
        ArgsTestCase("Case 4", "A2Q1", listOf("2009"),
                a2q1Result(2009, "ji-chou", "Ox")) to 0.25
))

private fun a2q2Result(
        average: String,
        mode: String,
        median: String
) = "average = $average\nmode = $mode\nmedian = $median"

val a2q2 = Problem("A2Q2", mapOf(
        ArgsTestCase("Case 1", "A2Q2",
                listOf("1.1", "2.2", "3", "4", "5", "6", "7", "2", "3.2", "2", "0.2", "-1", "2", "3.5", "2"),
                a2q2Result("2.81", "2.00", "2.20")) to 0.25,
        ArgsTestCase("Case 2", "A2Q2", listOf(1, 2, 3, 4, 5, 6, 7, 2, 3, 2).map { it.toString() },
                a2q2Result("3.50", "2.00", "3.00")) to 0.25,
        ArgsTestCase("Case 3", "A2Q2",
                listOf(1, 48, 49, 50, 50, 52, 55, 50, 51, 53, 50, 49, 1, 2, 3, 3, 2, 1, 999).map { it.toString() },
                a2q2Result("82.58", "50.00", "49.00")) to 0.25,
        ArgsTestCase("Case 4", "A2Q2",
                listOf(1, 48, 49, 50, 50, 52, 55, 49, 50, 51, 49, 53, 50, 49, 1, 2, 3, 3, 2, 1, 999).map { it.toString() },
                a2q2Result("79.38", "49.00 50.00", "49.00")) to 0.25
))

val a2q3_1 = Problem("A2Q3_1", mapOf(
        ArgsTestCase("Case 1", "A2Q3_1", listOf("A"), "3.94") to 0.20,
        ArgsTestCase("Case 2", "A2Q3_1", listOf("A+"), "4.00") to 0.20,
        ArgsTestCase("Case 3", "A2Q3_1", listOf("B-"), "3.32") to 0.20,
        ArgsTestCase("Case 4", "A2Q3_1", listOf("D"), "1.63") to 0.20,
        ArgsTestCase("Case 5", "A2Q3_1", listOf("F"), "0.00") to 0.20
))

val a2q3_2 = Problem("A2Q3_2", mapOf(
        ArgsTestCase("Case 1", "A2Q3_2",
                listOf("95", "3", "92", "2", "90", "2", "85", "4", "62", "85.3", "3"),
                "Please input the right format of score and credit hour in pair, eg. 95 2 88 3") to 0.5,
        ArgsTestCase("Case 2", "A2Q3_2",
                listOf("95", "3", "92", "2", "90", "2", "85", "4", "62", "3", "85.3", "3"),
                "GPA = 3.27") to 0.5
))

private fun a2q4Case(caseNo: Int, expr: String, result: String) = ArgsTestCase(
        "Case $caseNo",
        "A2Q4",
        listOf(expr),
        "$expr=$result"
)

val a2q4 = Problem("A2Q4", mapOf(
        a2q4Case(1, "3.3*4.2+2.1", "15.96") to 0.14,
        a2q4Case(2, "3.3+4.2/2.1", "5.30") to 0.14,
        a2q4Case(3, "3.3+4.2-2.1", "5.40") to 0.14,
        a2q4Case(4, "3.3*(4.2-2.1)", "6.93") to 0.10,
        a2q4Case(5, "2*3-4", "2.00") to 0.14,
        a2q4Case(6, "2*(3-4)", "-2.00") to 0.10,
        a2q4Case(7, "(2.5*3-4)", "3.50") to 0.03,
        a2q4Case(8, "(2.5+3)*4", "22.00") to 0.07,
        a2q4Case(9, "2.5+3*4", "14.50") to 0.14
))