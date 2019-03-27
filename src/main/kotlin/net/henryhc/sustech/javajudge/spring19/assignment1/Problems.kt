package net.henryhc.sustech.javajudge.spring19.assignment1

import net.henryhc.sustech.javajudge.problems
import net.henryhc.sustech.javajudge.worth

val problemsAssignment1 = problems(
        a1q1 worth 20.0,
        a1q2 worth 20.0,
        a1q3 worth 20.0,
        a1q4 worth 20.0,
        a1q5 worth 20.0
)

@Suppress("unused")
val problemsAssignment1Rejudge = problemsAssignment1.mapValues { it.value * 0.8 }