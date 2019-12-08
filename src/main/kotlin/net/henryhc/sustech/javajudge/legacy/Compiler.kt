package net.henryhc.sustech.javajudge.legacy

import java.io.File
import java.io.StringWriter
import javax.tools.ToolProvider

class Compiler {
    fun compile(files: List<File>): Boolean {
        val compiler = ToolProvider.getSystemJavaCompiler()
        val fileManager = compiler.getStandardFileManager(null, null, Charsets.UTF_8)
        val compilationUnits = fileManager.getJavaFileObjectsFromFiles(files)
        val result = compiler.getTask(
                StringWriter(),
                fileManager,
                null,
                listOf("-cp", files.first().parentFile.absolutePath),
                null,
                compilationUnits
        ).call()
        fileManager.close()
        return result
    }
}