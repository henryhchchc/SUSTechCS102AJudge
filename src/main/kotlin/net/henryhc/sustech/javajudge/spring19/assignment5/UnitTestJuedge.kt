package net.henryhc.sustech.javajudge.spring19.assignment5

import net.henryhc.sustech.javajudge.Problem
import net.henryhc.sustech.javajudge.testCases
import net.henryhc.sustech.javajudge.testcases.unittest.JUnitTestCase
import net.henryhc.sustech.javajudge.worth

val unitTestJudge = Problem("Unit test judge", testCases(
    JUnitTestCase("JUnit provided by Prof. Liu", "A5Test") worth 1.0
))
