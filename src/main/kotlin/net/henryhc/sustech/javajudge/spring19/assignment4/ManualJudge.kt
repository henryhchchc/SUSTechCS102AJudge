package net.henryhc.sustech.javajudge.spring19.assignment4

import net.henryhc.sustech.javajudge.sakai.Problem
import net.henryhc.sustech.javajudge.legacy.testCases
import net.henryhc.sustech.javajudge.legacy.testcases.CompileTestCase
import net.henryhc.sustech.javajudge.legacy.testcases.filemarker.FileMarkerTestCase
import net.henryhc.sustech.javajudge.legacy.worth

val manualJudge = Problem("Manual Judge", testCases(
        FileMarkerTestCase("Submission", "nosubmit",
                "No submission, comment below are all invalid.",
                presentScore = 1.0, notPresentScore = 0.0) worth -2000.0,
        CompileTestCase("CourseTest.java compile (automatic)", setOf("Course", "CourseTest")) worth 0.40,
        FileMarkerTestCase("Logic Validity 1", "l1",
                "Invalid Logic") worth 0.10,
        FileMarkerTestCase("Logic Validity 2", "l2",
                "Invalid Logic") worth 0.10,
        FileMarkerTestCase("Design Validity 1", "d1",
                "Invalid Logic") worth 0.10,
        FileMarkerTestCase("Design Validity 4", "d2",
                "Invalid Logic") worth 0.10,
        FileMarkerTestCase("Code style", "style",
                "Your code is like caixukun") worth 0.20
))
