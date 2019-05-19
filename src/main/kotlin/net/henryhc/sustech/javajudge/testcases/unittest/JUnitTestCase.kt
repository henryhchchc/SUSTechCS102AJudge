package net.henryhc.sustech.javajudge.testcases.unittest

import net.henryhc.sustech.javajudge.sakai.Submission
import net.henryhc.sustech.javajudge.sakai.TestCaseJudgeResult
import net.henryhc.sustech.javajudge.testcases.TestCase
import org.junit.platform.engine.discovery.DiscoverySelectors.selectClass
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder
import org.junit.platform.launcher.core.LauncherFactory
import org.junit.platform.launcher.listeners.SummaryGeneratingListener
import java.net.URLClassLoader

class JUnitTestCase(
        name: String,
        val testClassName: String
) : TestCase(name) {
    override fun judge(submission: Submission): TestCaseJudgeResult {
        val clazz = submission.attachmentsDirectory.toURI().toURL()
                .let { URLClassLoader(arrayOf(it)) }
                .loadClass(testClassName)
        val request = LauncherDiscoveryRequestBuilder.request()
                .selectors(selectClass(clazz))
                .build()
        val launcher = LauncherFactory.create()
        val testPlan = launcher.discover(request)
        val listener = SummaryGeneratingListener()
        launcher.registerTestExecutionListeners(listener)

        launcher.execute(testPlan)
        val summary = listener.summary
        val score = 1.0 * summary.testsSucceededCount / summary.testsFoundCount
        val message = "${summary.testsSucceededCount} of ${summary.testsFoundCount} Test cases passed\n" +
                if (summary.failures.any()) {
                    "Failed Cases:\n${summary.failures.joinToString("\n") { it.testIdentifier.displayName }}\n"
                } else {
                    "\n"
                }
        return TestCaseJudgeResult(score, this.name, message)
    }
}
