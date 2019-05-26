package net.henryhc.sustech.javajudge.spring19.assignment2

import net.henryhc.sustech.javajudge.sakai.Problem
import net.henryhc.sustech.javajudge.answercheckers.ExactMatchChecker
import net.henryhc.sustech.javajudge.testcases.io.ArgsTestCase
import net.henryhc.sustech.javajudge.testCases
import net.henryhc.sustech.javajudge.worth

private fun a2q1Checker(year: Int, sb: String, animal: String) = ExactMatchChecker("$year is the year of $sb. Also $animal year.")

val a2q1 = Problem("A2Q1", testCases(
        ArgsTestCase("Case 1", "A2Q1", listOf("2019"),
                a2q1Checker(2019, "ji-hai", "Pig")) worth 0.125,
        ArgsTestCase("Case 2", "A2Q1", listOf("1898"),
                a2q1Checker(1898, "wu-xu", "Dog")) worth 0.125,
        ArgsTestCase("Case 3", "A2Q1", listOf("1949"),
                a2q1Checker(1949, "ji-chou", "Ox")) worth 0.125,
        ArgsTestCase("Case 4", "A2Q1", listOf("2009"),
                a2q1Checker(2009, "ji-chou", "Ox")) worth 0.125,
        ArgsTestCase("Case 5", "A2Q1", listOf("2020"),
                a2q1Checker(2020, "geng-zi", "Rat")) worth 0.125,
        ArgsTestCase("Case 6", "A2Q1", listOf("2050"),
                a2q1Checker(2050, "geng-wu", "Horse")) worth 0.125,
        ArgsTestCase("Case 7", "A2Q1", listOf("1644"),
                a2q1Checker(1644, "jia-shen", "Monkey")) worth 0.125,
        ArgsTestCase("Case 8", "A2Q1", listOf("618"),
                a2q1Checker(618, "wu-yin", "Tiger")) worth 0.125
))

private fun a2q2Checker(
        average: String,
        mode: String,
        median: String
) = ExactMatchChecker("average = $average\nmode = $mode\nmedian = $median")

val a2q2 = Problem("A2Q2", testCases(
        ArgsTestCase("Case 1", "A2Q2",
                listOf("1.1", "2.2", "3", "4", "5", "6", "7", "2", "3.2", "2", "0.2", "-1", "2", "3.5", "2"),
                a2q2Checker("2.81", "2.00", "2.20")) worth 0.125,
        ArgsTestCase("Case 2", "A2Q2", listOf(1, 2, 3, 4, 5, 6, 7, 2, 3, 2).map { it.toString() },
                a2q2Checker("3.50", "2.00", "3.00")) worth 0.125,
        ArgsTestCase("Case 3", "A2Q2",
                listOf(1, 48, 49, 50, 50, 52, 55, 50, 51, 53, 50, 49, 1, 2, 3, 3, 2, 1, 999).map { it.toString() },
                a2q2Checker("82.58", "50.00", "49.00")) worth 0.125,
        ArgsTestCase("Case 4", "A2Q2",
                listOf(1, 48, 49, 50, 50, 52, 55, 49, 50, 51, 49, 53, 50, 49, 1, 2, 3, 3, 2, 1, 999).map { it.toString() },
                a2q2Checker("79.38", "49.00 50.00", "49.00")) worth 0.125,
        ArgsTestCase("Case 5", "A2Q2",
                listOf("1.1", "1.2", "1.3", "1.4", "1.5", "1.6", "1.7", "-1.8", "1.9", "2", "1.5", "1.6", "1.8", "1.5", "1.6", "1.8"),
                a2q2Checker("1.36", "1.50 1.60", "1.55")) worth 0.125,
        ArgsTestCase("Case 6", "A2Q2",
                listOf(0, 1, 1, 2, 2, 3, 22, 23, 25, 25, 25, 26, 27, 28, 25, 26, 9999).map { it.toString() },
                a2q2Checker("603.53", "25.00", "25.00")) worth 0.125,
        ArgsTestCase("Case 7", "A2Q2",
                listOf(0, 1, 1, 2, 2, 3, 22, 23, 25, 25, 25, 26, 27, 28, 25, 26, 9999, 26, 10000).map { it.toString() },
                a2q2Checker("1067.68", "25.00", "25.00")) worth 0.125,
        ArgsTestCase("Case 8", "A2Q2",
                listOf(0, 1, 1, 2, 2, 3, 22, 23, 25, 25, 25, 26, 27, 28, 25, 26, 9999, 26, 10000, 26).map { it.toString() },
                a2q2Checker("1015.60", "25.00 26.00", "25.00")) worth 0.125
))

val a2q3_1 = Problem("A2Q3_1", testCases(
        ArgsTestCase("Case 1", "A2Q3_1", listOf("A"), ExactMatchChecker("3.94")) worth 0.20,
        ArgsTestCase("Case 2", "A2Q3_1", listOf("A+"), ExactMatchChecker("4.00")) worth 0.20,
        ArgsTestCase("Case 3", "A2Q3_1", listOf("B-"), ExactMatchChecker("3.32")) worth 0.20,
        ArgsTestCase("Case 4", "A2Q3_1", listOf("D"), ExactMatchChecker("1.63")) worth 0.20,
        ArgsTestCase("Case 5", "A2Q3_1", listOf("F"), ExactMatchChecker("0.00")) worth 0.20
))

val a2q3_2 = Problem("A2Q3_2", testCases(
        ArgsTestCase("Case 1", "A2Q3_2",
                listOf("95", "3", "92", "2", "90", "2", "85", "4", "62", "85.3", "3"),
                ExactMatchChecker("Please input the right format of score and credit hour in pair, eg. 95 2 88 3")) worth (1 / 5.0),
        ArgsTestCase("Case 2", "A2Q3_2",
                listOf("95", "3", "92", "2", "90", "2", "85", "4", "62", "3", "85.3", "3"),
                ExactMatchChecker("GPA = 3.27")) worth (1 / 5.0),
        ArgsTestCase("Case 3", "A2Q3_2",
                listOf(99, 3, 94, 2, 90, 3, 55, 2, 88, 2, 82, 3, 77, 3).map { it.toString() },
                ExactMatchChecker("GPA = 3.23")) worth (1 / 5.0),
//        ArgsTestCase("Case 4", "A2Q3_2",
//                listOf("55.5", "3", "67.5", "2", "88.5", "2", "90.5", "3", "99.5", "3", "87.5", "4", "81.5", "3", "91.5", "4"),
//                ExactMatchChecker("GPA = 3.26")) worth (1 / 6.0),
        ArgsTestCase("Case 4", "A2Q3_2",
                listOf(99, 3, 94, 2, 90, 3, 55, 2, 88, 2, 82, 3, 77, 3, 85, 2).map { it.toString() },
                ExactMatchChecker("GPA = 3.26")) worth (1 / 5.0),
        ArgsTestCase("Case 5", "A2Q3_2",
                listOf(99, 3, 94, 2, 90, 3, 55, 2, 88, 2, 82, 3, 77, 3, 85, 2, 0, 2).map { it.toString() },
                ExactMatchChecker("GPA = 2.96")) worth (1 / 5.0)
))

private fun a2q4Case(caseNo: Int, expr: String, result: String) = ArgsTestCase(
        "Case $caseNo",
        "A2Q4",
        listOf(expr),
        ExactMatchChecker("$expr=$result")
)

val a2q4 = Problem("A2Q4", testCases(
        a2q4Case(1, "3.3*4.2+2.1", "15.96") worth (1.0 / 13),
        a2q4Case(2, "3.3+4.2/2.1", "5.30") worth (1.0 / 13),
        a2q4Case(3, "3.3+4.2-2.1", "5.40") worth (1.0 / 13),
        a2q4Case(4, "3.3*(4.2-2.1)", "6.93") worth (1.0 / 13),
        a2q4Case(5, "2*3-4", "2.00") worth (1.0 / 13),
        a2q4Case(6, "2*(3-4)", "-2.00") worth (1.0 / 13),
        a2q4Case(7, "(2.5+3)*4", "22.00") worth (1.0 / 13),
        a2q4Case(8, "2.5+3*4", "14.50") worth (1.0 / 13),
        a2q4Case(9, "1.2-2.3*4.5", "-9.15") worth (1.0 / 13),
        a2q4Case(10, "1.2/2.3+4.5", "5.02") worth (1.0 / 13),
        a2q4Case(11, "1.2/2.3*4.5", "2.35") worth (1.0 / 13),
        a2q4Case(12, "2*(3+5.4)", "16.80") worth (1.0 / 13),
        a2q4Case(13, "(2-3)/5.44", "-0.18") worth (1.0 / 13)
))