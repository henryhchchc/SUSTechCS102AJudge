package net.henryhc.sustech.javajudge.sakai

import net.henryhc.sustech.javajudge.Problem
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser
import org.apache.commons.csv.CSVPrinter
import org.apache.commons.csv.QuoteMode
import java.io.File
import java.io.StringWriter

class Assignment(
        val path: String,
        val problemsWithScore: Map<Problem, Double> = emptyMap()
) {
    private val submissions: List<Submission>
    private val csvFirstTwoLines: String
    private val csvFormat = CSVFormat.DEFAULT.withSkipHeaderRecord().withQuoteMode(QuoteMode.ALL)
            .withHeader(
                    "显示ID", "ID", "姓", "名",
                    "分数", "提交时间", "迟交"
            )

    init {
        val csvFileLines = File(path, GradeFileName).readLines()
        this.csvFirstTwoLines = csvFileLines.take(2).joinToString("\n")
        this.submissions = csvFileLines.drop(2).joinToString("\n")
                .let { CSVParser.parse(it, csvFormat) }.map {
                    val studentInfo = StudentInfo(it.get("ID"), "${it.get("姓")}, ${it.get("名")}")
                    val submissionPath = File(path, "${it.get("姓")}, ${it.get("名")}(${it.get("ID")})").absolutePath
                    Submission(submissionPath, studentInfo, it.get("迟交") == "迟交", it.get("提交时间"))
                }
    }

    fun judge(): Map<Submission, SubmissionJudgeResult> = this.submissions.map {
        it to it.judge(this.problemsWithScore)
    }.toMap()

    fun writeGradeCsv(results: List<SubmissionJudgeResult>) {
        val writer = StringWriter()
        val csvWriter = CSVPrinter(writer, csvFormat)
        csvWriter.printRecord("显示ID", "ID", "姓", "名", "分数", "提交时间", "迟交")
        results.forEach {
            csvWriter.printRecord(
                    it.submission.student.id,
                    it.submission.student.id,
                    it.submission.student.name.split(", ")[0],
                    it.submission.student.name.split(", ")[1],
                    String.format("%.1f", it.score),
                    it.submission.timeStampStr,
                    if (it.submission.isLateSubmission) "迟交" else "按时"
            )
        }
        csvWriter.flush()
        File(path, GradeFileName).writeText("${this.csvFirstTwoLines}\n$writer")
    }

    companion object {
        private const val GradeFileName = "grades.csv"
    }
}
