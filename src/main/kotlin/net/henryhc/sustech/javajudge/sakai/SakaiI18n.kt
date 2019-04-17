package net.henryhc.sustech.javajudge.sakai

class SakaiI18n private constructor(
        val csvHeader: Array<String>,
        val studentIdKey: String,
        val firstNameKey: String,
        val lastNameKey: String,
        val scoreKey: String,
        val submissionTimeKey: String,
        val isLateSubmissionKey: String,
        val submissionAttachmentFolderName: String,
        val lateSubmissionText: String,
        val onTimeSubmissionText: String
) {
    companion object {
        val zh_CN = SakaiI18n(
                arrayOf("显示ID", "ID", "姓", "名", "分数", "提交时间", "迟交"),
                "ID",
                "名",
                "姓",
                "分数",
                "提交时间",
                "迟交",
                "提交作业的附件",
                "迟交",
                "按时"
        )

        val en_US = SakaiI18n(
                arrayOf("Display ID", "ID", "Last Name", "First Name", "grade", "Submission date", "Late submission"),
                "ID",
                "First Name",
                "Last Name",
                "grade",
                "Submission date",
                "Late submission",
                "Submission attachment(s)",
                "Late",
                "On time"
        )
    }
}
