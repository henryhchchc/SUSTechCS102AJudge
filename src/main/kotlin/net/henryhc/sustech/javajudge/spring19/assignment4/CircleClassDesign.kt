package net.henryhc.sustech.javajudge.spring19.assignment4

import net.henryhc.sustech.javajudge.Problem
import net.henryhc.sustech.javajudge.testCases
import net.henryhc.sustech.javajudge.testcases.classdesign.FieldTestCase
import net.henryhc.sustech.javajudge.testcases.classdesign.GetterTestCase
import net.henryhc.sustech.javajudge.testcases.classdesign.MethodTestCase
import net.henryhc.sustech.javajudge.testcases.classdesign.SetterTestCase
import net.henryhc.sustech.javajudge.worth

val circleClassDesign = Problem("Circle class design", testCases(
        MethodTestCase("toString method", setOf("Course"),
                "Course", "toString", String::class.java, emptyList()) worth 0.15,
        MethodTestCase("getCourseLevel method", setOf("Course"),
                "Course", "getCourseLevel", String::class.java, emptyList()) worth 0.15,
        MethodTestCase("getQualificationForCourse method", setOf("Course"),
                "Course", "getQualificationForCourse", String::class.java,
                listOf(String::class.java)) worth 0.15,
        MethodTestCase("isWithLab method", setOf("Course"),
                "Course", "isWithLab", Boolean::class.java, emptyList()) worth 0.15,
        *mapOf(
                "name" to String::class.java,
                "credit" to Int::class.java,
                "teacher" to String::class.java,
                "grade" to String::class.java
        ).map {
            listOf(
                    FieldTestCase("${it.key} field", setOf("Course"),
                            "Course", it.key, it.value) worth 0.1 / 3,
                    GetterTestCase("${it.key} getter", setOf("Course"),
                            "Course", it.key, it.value) worth 0.1 / 3,
                    SetterTestCase("${it.key} setter", setOf("Course"),
                            "Course", it.key, it.value) worth 0.1 / 3
            )
        }.flatten().toTypedArray()
))
