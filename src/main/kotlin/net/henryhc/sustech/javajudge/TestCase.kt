package net.henryhc.sustech.javajudge

import java.io.File
import java.io.StringWriter
import javax.tools.ToolProvider

abstract class TestCase(
        val name: String
) {
    protected fun compile(vararg files: File): Boolean {
        val compiler = ToolProvider.getSystemJavaCompiler()
        val fileManager = compiler.getStandardFileManager(null, null, Charsets.UTF_8)
        val compilationUnits = fileManager.getJavaFileObjectsFromFiles(files.asList())
        val result = compiler.getTask(
                StringWriter(),
                fileManager,
                null,
                null,
                null,
                compilationUnits
        ).call()
        fileManager.close()
        return result
    }

    abstract fun judge(submission: Submission): TestCaseJudgeResult
}
