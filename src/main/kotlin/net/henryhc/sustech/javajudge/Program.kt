package net.henryhc.sustech.javajudge

import net.henryhc.sustech.javajudge.sakai.Assignment
import net.henryhc.sustech.javajudge.sakai.SakaiI18n
import net.henryhc.sustech.javajudge.spring19.assignment3.problemsAssignment3
import kotlin.system.exitProcess


fun main(args: Array<String>) {
    if (args.size != 1) {
        System.err.println("Usage: java -jar <jar-file-name> <sakai-directory>")
        exitProcess(1)
    }
    sakaiI18n = SakaiI18n.zh_CN
    val ass = Assignment(args[0], problemsAssignment3)
    val result = ass.judge()
    ass.writeGradeCsv(result.map { it.value })
    result.forEach { t, u ->
        t.writeFeedback(u.feedback)
//        println(t.student.name)
//        println(u.score)
//        println(u.feedback)
    }
    println("Done")
}
