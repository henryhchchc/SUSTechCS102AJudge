package net.henryhc.sustech.javajudge.programrunners

import java.io.File
import java.util.concurrent.TimeUnit

class LocalProgramRunner(
        private val workingDirectory: File,
        private val mainClassName: String,
        private val timeLimit: Long,
        private val args: Array<String>,
        private val standardInput: String? = null
) {

    private var process: Process? = null

    fun runWithTimeLimitCheck(): Boolean {
        val inputFile = standardInput?.let { createTempFile() }?.apply { writeText(standardInput) }
        process = ProcessBuilder("java", mainClassName, *args)
                .directory(workingDirectory)
                .redirectOutput(ProcessBuilder.Redirect.PIPE)
                .redirectError(ProcessBuilder.Redirect.PIPE)
                .apply {
                    if (inputFile != null)
                        redirectInput(inputFile)
                }
                .start()
        process!!.waitFor(timeLimit, TimeUnit.SECONDS)
        if (process!!.isAlive) {
            process!!.destroy()
            inputFile?.delete()
            return true
        }
        inputFile?.delete()
        return false
    }

    val standoutOutputLines get() = process?.inputStream?.bufferedReader()?.readLines() ?: emptyList()

    val standardErrorLines get() = process?.errorStream?.bufferedReader()?.readLines() ?: emptyList()
}