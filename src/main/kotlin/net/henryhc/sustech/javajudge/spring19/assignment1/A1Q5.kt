package net.henryhc.sustech.javajudge.spring19.assignment1

import net.henryhc.sustech.javajudge.Problem
import net.henryhc.sustech.javajudge.answercheckers.ExactMatchChecker
import net.henryhc.sustech.javajudge.testcases.io.StdinTestCase
import net.henryhc.sustech.javajudge.testCases
import net.henryhc.sustech.javajudge.worth

private const val expectedOutput = """Enter the first number: Enter the second number: Sum of two numbers is 90
Sum does not equal 100, loop repeats
Enter the first number: Enter the second number: Sum of two numbers is 101
Sum does not equal 100, loop repeats
Enter the first number: Enter the second number: Sum of two numbers is 368
Sum does not equal 100, loop repeats
Enter the first number: Enter the second number: Sum of two numbers is 55
Sum does not equal 100, loop repeats
Enter the first number: Enter the second number: Sum of two numbers is 100
Sum equals 100, loop terminates"""

private const val input = """34
56
23
78
345
23
43
12
34
66
"""

val a1q5 = Problem("A1Q5", testCases(
        StdinTestCase("Case 1", "A1Q5", input, ExactMatchChecker(expectedOutput)) worth 1.0
))