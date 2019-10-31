package net.henryhc.sustech.javajudge

import net.henryhc.sustech.javajudge.sakai.Assignment
import net.henryhc.sustech.javajudge.sakai.SakaiI18n
import net.henryhc.sustech.javajudge.fall19.assignment2.problemsAssignment2
import java.io.File
import kotlin.system.exitProcess


fun main(args: Array<String>) {

    if (args.size != 1) {
        System.err.println("Usage: java -jar <jar-file-name> <sakai-directory>")
        exitProcess(1)
    } else if (!File(args[0]).isDirectory) {
        System.err.println("Not a directory: ${args[0]}")
        exitProcess(-1)
    }

    println("Judging using $concurrentJudgingCount concurrent jobs.")
    sakaiI18n = SakaiI18n.en_US

    val assignment = Assignment(args[0], problemsAssignment2)
    val result = assignment.judge { println("Judging ${it.student.name}") }
    assignment.writeGradeCsv(result.map { it.value })
    result.forEach { (t, u) -> t.writeFeedback(u.feedback, String.format("%.1f",u.score)) }
    println("Done")
}
