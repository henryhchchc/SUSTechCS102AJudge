package net.henryhc.sustech.javajudge.fall19.assignment1

import net.henryhc.sustech.javajudge.sakai.Problem
import net.henryhc.sustech.javajudge.answercheckers.ExactMatchChecker
import net.henryhc.sustech.javajudge.testcases.io.ArgsTestCase
import net.henryhc.sustech.javajudge.testCases
import net.henryhc.sustech.javajudge.worth

val a1q1 = Problem("A1Q1", testCases(
        ArgsTestCase("Case 1", "A1Q1", listOf("张三", "11814585"), ExactMatchChecker("张三, welcome to SUSTECH Hot Pot Restaurant!")) worth 0.2,
        ArgsTestCase("Case 2", "A1Q1", listOf("李四", "117121111"), ExactMatchChecker("117121111")) worth 0.2,
        ArgsTestCase("Case 3", "A1Q1", listOf("Tom", "30123456"), ExactMatchChecker("30123456")) worth 0.2,
        ArgsTestCase("Case 4", "A1Q1", listOf("James", "11910101"), ExactMatchChecker("James, welcome to SUSTECH Hot Pot Restaurant!")) worth 0.2,
        ArgsTestCase("Case 5", "A1Q1", listOf("王二", "11212122"), ExactMatchChecker("11212122")) worth 0.2
        ))

val a1q4 = Problem("A1Q4", testCases(
        ArgsTestCase("Case 1", "A1Q4", listOf("9000"), ExactMatchChecker("Diamond")) worth 0.1,
        ArgsTestCase("Case 2", "A1Q4", listOf("1000", "1999", "500", "8010", "1000"), ExactMatchChecker("Diamond")) worth 0.1,
        ArgsTestCase("Case 3", "A1Q4", listOf("1000", "1999", "500", "1000", "399", "566", "1000", "500", "60", "700", "555", "111", "1000", "2000"), ExactMatchChecker("Diamond")) worth 0.1,
        ArgsTestCase("Case 4", "A1Q4", listOf("1000", "1999", "500", "4000"), ExactMatchChecker("Gold")) worth 0.1,
        ArgsTestCase("Case 5", "A1Q4", listOf("1000", "2999", "500", "2000"), ExactMatchChecker("Silver")) worth 0.1,
        ArgsTestCase("Case 6", "A1Q4", listOf("200", "1000", "2999", "500", "2000"), ExactMatchChecker("Gold")) worth 0.1,
        ArgsTestCase("Case 7", "A1Q4", listOf("7999"), ExactMatchChecker("Gold")) worth 0.1,
        ArgsTestCase("Case 8", "A1Q4", listOf("2999"), ExactMatchChecker("Silver")) worth 0.1,
        ArgsTestCase("Case 9", "A1Q4", listOf("800", "1"), ExactMatchChecker("Silver")) worth 0.1,
        ArgsTestCase("Case 10", "A1Q4", listOf("2999", "2999", "2999", "2999"), ExactMatchChecker("Silver")) worth 0.1,
))

val a1q5 = Problem("A1Q5", testCases(
        ArgsTestCase("Case 1", "A1Q5", listOf("12.5", "23", "11", "22.5", "32", "5"), ExactMatchChecker("16.5 26.5 36")) worth 0.2,
        ArgsTestCase("Case 2", "A1Q5", listOf("6.5", "1.9", "1.4", "14.9", "14", "33.1"), ExactMatchChecker("19.9 19")) worth 0.2,
        ArgsTestCase("Case 3", "A1Q5", listOf("11.5", "21.2", "33.1", "11", "23.5", "31"), ExactMatchChecker("")) worth 0.2,
        ArgsTestCase("Case 4", "A1Q5", listOf("12.5", "19.9", "3.2", "2.2", "4.4", "24.5", "14.2"), ExactMatchChecker("16.5 6.2 9.4 29.5 19.2")) worth 0.2,
        ArgsTestCase("Case 5", "A1Q5", listOf("11.5", "15.6", "22.5", "32.2", "2", "11.4", ""), ExactMatchChecker("3 \n26.5 36.2 6 ")) worth 0.1
)