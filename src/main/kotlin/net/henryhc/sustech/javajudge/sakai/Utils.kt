package net.henryhc.sustech.javajudge.sakai

import net.henryhc.sustech.javajudge.sakaiI18n
import org.apache.commons.csv.CSVPrinter
import org.apache.commons.csv.CSVRecord
import java.io.File

fun CSVPrinter.printSubmissionResult(result: SubmissionJudgeResult) = printRecord(
        result.submission.student.id,
        result.submission.student.id,
        result.submission.student.name.split(", ")[0],
        result.submission.student.name.split(", ")[1],
        String.format("%.1f", result.score),
        result.submission.timeStampStr,
        if (result.submission.isLateSubmission) sakaiI18n.lateSubmissionText else sakaiI18n.onTimeSubmissionText
)

fun CSVRecord.toStudentInfo() = StudentInfo(
        get(sakaiI18n.studentIdKey),
        "${get(sakaiI18n.lastNameKey)}, ${get(sakaiI18n.firstNameKey)}"
)

fun CSVRecord.toSubmissionPath(assignmentPath: String): String = File(
        assignmentPath,
        "${get(sakaiI18n.lastNameKey)}, ${get(sakaiI18n.firstNameKey)}(${get(sakaiI18n.studentIdKey)})"
).absolutePath
