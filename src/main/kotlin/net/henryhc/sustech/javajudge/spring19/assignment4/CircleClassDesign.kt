package net.henryhc.sustech.javajudge.spring19.assignment4

import net.henryhc.sustech.javajudge.Problem
import net.henryhc.sustech.javajudge.testCasesAverage
import net.henryhc.sustech.javajudge.testcases.classdesign.FieldTestCase
import net.henryhc.sustech.javajudge.testcases.classdesign.GetterTestCase
import net.henryhc.sustech.javajudge.testcases.classdesign.MethodTestCase

val circleClassDesign = Problem("Circle class design", testCasesAverage(
        MethodTestCase("toString method", setOf("Course"),
                "Course", "toString", String::class.java, emptyList()),
        MethodTestCase("getCourseLevel method", setOf("Course"),
                "Course", "getCourseLevel", String::class.java, emptyList()),
        MethodTestCase("getQualificationForCourse method", setOf("Course"),
                "Course", "getQualificationForCourse", String::class.java,
                listOf(String::class.java)),
        MethodTestCase("isWithLab method", setOf("Course"),
                "Course", "isWithLab", Boolean::class.java, emptyList()),
        *mapOf(
                "name" to String::class.java,
                "credit" to Int::class.java,
                "teacher" to String::class.java,
                "grade" to String::class.java
        ).map {
            listOf(
                    FieldTestCase("${it.key} field", setOf("Course"),
                            "Course", it.key, it.value),
                    GetterTestCase("${it.key} getter", setOf("Course"),
                            "Course", it.key, it.value),
                    GetterTestCase("${it.key} setter", setOf("Course"),
                            "Course", it.key, it.value)
            )
        }.flatten().toTypedArray()
))