package net.henryhc.sustech.javajudge.legacy.testcases.unittest

import net.henryhc.sustech.javajudge.sakai.Submission
import net.henryhc.sustech.javajudge.sakai.TestCaseJudgeResult
import net.henryhc.sustech.javajudge.legacy.testcases.TestCase
import org.junit.platform.engine.discovery.DiscoverySelectors.selectClass
import org.junit.platform.launcher.core.LauncherConfig
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder
import org.junit.platform.launcher.core.LauncherFactory
import org.junit.platform.launcher.listeners.SummaryGeneratingListener
import org.junit.platform.launcher.listeners.TestExecutionSummary
import java.net.URLClassLoader

class JUnitTestCase(
        name: String,
        private val testClassName: String
) : TestCase(name) {
    override fun judge(submission: Submission): TestCaseJudgeResult {
        val config = LauncherConfig.builder()
                .build()
        val launcher = LauncherFactory.create(config)
        val summary = submission.attachmentsDirectory.toURI().toURL()
                .let { URLClassLoader(arrayOf(it)) }
                .loadClass(testClassName)
                .let { LauncherDiscoveryRequestBuilder.request().selectors(selectClass(it)).build() }
                .let { launcher.discover(it) }
                .let { SummaryGeneratingListener().apply { launcher.execute(it, this) }.summary }
        val score = 1.0 * summary.testsSucceededCount / summary.testsFoundCount
        val message = "${summary.testsSucceededCount} of ${summary.testsFoundCount} Test cases passed\n" +
                if (summary.failures.any()) {
                    "Failed Cases:\n${generateFailTestCasesMessage(summary.failures)}\n"
                } else {
                    "\n"
                }
        return TestCaseJudgeResult(score, this.name, message)
    }

    private fun generateFailTestCasesMessage(failures: List<TestExecutionSummary.Failure>) =
            failures.joinToString("\n\n") {
                "${it.testIdentifier.displayName}\n----------\n${it.exception}"
            }
}
