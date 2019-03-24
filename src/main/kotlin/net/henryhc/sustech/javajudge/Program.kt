package net.henryhc.sustech.javajudge

import net.henryhc.sustech.javajudge.spring19.assignment1.*

fun main(args: Array<String>) {
    val problems = mapOf(
            a1q1 to 20.0,
            a1q2 to 20.0,
            a1q3 to 20.0,
            a1q4 to 20.0,
            a1q5 to 20.0
    )
    val ass = Assignment("/home/henry/Desktop/Assignment 1/", problems)
    val result = ass.judge()
    ass.writeGradeCsv(result.map { it.value })
    result.forEach { t, u ->
        t.writeFeedback(u.feedback)
        println(t.student.name)
        println(u.score)
        println(u.feedback)
    }
}