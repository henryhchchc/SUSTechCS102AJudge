package net.henryhc.sustech.javajudge

import net.henryhc.sustech.javajudge.spring19.assignment2.problemsAssignment2


fun main(args: Array<String>) {
    val ass = Assignment(args[0], problemsAssignment2)
    val result = ass.judge()
    ass.writeGradeCsv(result.map { it.value })
    result.forEach { t, u ->
        t.writeFeedback(u.feedback)
        println(t.student.name)
        println(u.score)
        println(u.feedback)
    }
}