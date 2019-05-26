package net.henryhc.sustech.javajudge.sakai

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import net.henryhc.sustech.javajudge.concurrentJudgingCount
import net.henryhc.sustech.javajudge.sakaiI18n
import org.apache.commons.csv.*
import java.io.File
import java.io.StringWriter

class Assignment(
        private val path: String,
        private val problemsWithScoreMap: Map<Problem, Double> = emptyMap()
) {
    private val submissions: List<Submission>
    private val csvFirstTwoLines: String
    private val csvFormat = CSVFormat.DEFAULT.withSkipHeaderRecord().withQuoteMode(QuoteMode.ALL)
            .withHeader(*sakaiI18n.csvHeader)

    private val channel: Channel<Int> = Channel(concurrentJudgingCount)

    init {
        val csvFileLines = File(path, GradeFileName).readLines()
        this.csvFirstTwoLines = csvFileLines.take(2).joinToString("\n")
        this.submissions = csvFileLines.drop(2).joinToString("\n")
                .let { CSVParser.parse(it, csvFormat) }.map {
                    Submission(
                            it.toSubmissionPath(path),
                            it.toStudentInfo(),
                            it.get(sakaiI18n.isLateSubmissionKey) == sakaiI18n.lateSubmissionText,
                            it.get(sakaiI18n.submissionTimeKey)
                    )
                }
        repeat(concurrentJudgingCount) { runBlocking { channel.send(1) } }
    }

    fun judge(beforeEachJudge: (Submission) -> Unit = {}): Map<Submission, SubmissionJudgeResult> = this.submissions.map {
        GlobalScope.async {
            channel.receive()
            (it to it.judge(problemsWithScoreMap, beforeEachJudge)).apply {
                channel.send(1)
            }
        }
    }.map { runBlocking { it.await() } }.toMap()

    fun writeGradeCsv(results: List<SubmissionJudgeResult>) = StringWriter().apply {
        CSVPrinter(this, csvFormat).run {
            printRecord(*sakaiI18n.csvHeader)
            results.forEach(this::printSubmissionResult)
            flush()
        }
    }.run {
        File(path, GradeFileName).writeText("$csvFirstTwoLines\n$this")
    }

    companion object {
        private const val GradeFileName = "grades.csv"
    }
}
