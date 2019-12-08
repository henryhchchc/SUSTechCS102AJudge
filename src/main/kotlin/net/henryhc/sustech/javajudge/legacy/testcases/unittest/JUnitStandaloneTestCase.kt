package net.henryhc.sustech.javajudge.legacy.testcases.unittest

import net.henryhc.sustech.javajudge.sakai.Submission
import net.henryhc.sustech.javajudge.sakai.TestCaseJudgeResult
import net.henryhc.sustech.javajudge.legacy.testcases.TestCase
import org.w3c.dom.Node
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory

class JUnitStandaloneTestCase(
        name: String,
        private val testClassName: String
) : TestCase(name) {
    override fun judge(submission: Submission): TestCaseJudgeResult {

        val proc = ProcessBuilder("java",
                "-jar", "junit-platform-console-standalone-1.4.2.jar",
                "-cp", ".",
                "-c", testClassName,
                "--reports-dir=./report")
                .directory(submission.attachmentsDirectory)
                .redirectOutput(ProcessBuilder.Redirect.PIPE)
                .redirectError(ProcessBuilder.Redirect.PIPE)
                .start()
        proc.waitFor()
        val xmlFile = File(submission.attachmentsDirectory, "report/TEST-junit-jupiter.xml")
        val doc = DocumentBuilderFactory
                .newInstance()
                .newDocumentBuilder()
                .parse(xmlFile)
        val testCaseNodes = doc.firstChild.children.filter { it.nodeName == "testcase" }
        val result = testCaseNodes.toTestResult()
        val score = if (result.total == 0) 0.0 else 1.0 - (1.0 * result.failures.size / result.total)
        val message = "${result.total - result.failures.size} of ${result.total} Test cases passed\n" +
                if (result.failures.any()) {
                    "Failed Cases:\n${generateFailTestCasesMessage(result.failures)}\n"
                } else {
                    "\n"
                }
        return TestCaseJudgeResult(score, this.name, message)
    }

    private fun generateFailTestCasesMessage(failures: List<TestCaseFailure>) =
            failures.joinToString("\n\n") {
                "${it.name}\n----------\n${it.message}"
            }
}

data class TestResult(
        val total: Int,
        val failures: List<TestCaseFailure> = emptyList()
)

data class TestCaseFailure(
        val name: String,
        val message: String
)

fun List<Node>.toTestResult() = TestResult(
        this.size,
        this.filter { it.children.any { ch -> ch.nodeName == "failure" } }.map {
            TestCaseFailure(it.attributes.getNamedItem("name").textContent,
                    it.children.first { fn -> fn.nodeName == "failure" }.attributes.getNamedItem("message").textContent
            )
        }
)

val Node.children get() = (0 until this.childNodes.length).map { childNodes.item(it) }