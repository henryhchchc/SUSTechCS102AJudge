package net.henryhc.sustech.javajudge.spring19

import net.henryhc.sustech.javajudge.Submission
import net.henryhc.sustech.javajudge.TestCase
import net.henryhc.sustech.javajudge.TestCaseJudgeResult
import java.util.concurrent.TimeUnit

class StdinTestCase(
        name: String,
        val className: String,
        val input: String,
        val expected: String
) : TestCase(name) {

    override fun judge(submission: Submission): TestCaseJudgeResult {
        val file = submission.files.singleOrNull { it.name == "$className.java" }
        if (file == null)
            return TestCaseJudgeResult(0.0, "[${this.name}] File $className.java not found")

        if (!compile(file)) {
            return TestCaseJudgeResult(0.0, "[${this.name}] Compile fail")
        }
        val command = listOf("java", className)
        val inputFile = createTempFile()
        inputFile.writeText(input)
        val proc = ProcessBuilder(command)
                .directory(file.parentFile)
                .redirectInput(inputFile)
                .redirectOutput(ProcessBuilder.Redirect.PIPE)
                .redirectError(ProcessBuilder.Redirect.PIPE)
                .start()
        proc.waitFor(2, TimeUnit.SECONDS)
        if (proc.isAlive) {
            proc.destroy()
            inputFile.delete()
            return TestCaseJudgeResult(0.0, "[${this.name}] Time out")
        }
        val output = proc.inputStream.bufferedReader().readLines().joinToString("\n") { it.trim() }.trim()
        inputFile.delete()
        return if (output == expected)
            TestCaseJudgeResult(1.0, "[${this.name}] Nice Work")
        else TestCaseJudgeResult(0.0,
                "[${this.name}] Wrong answer\nExpected:\n$expected\nActual:\n$output")
    }
}