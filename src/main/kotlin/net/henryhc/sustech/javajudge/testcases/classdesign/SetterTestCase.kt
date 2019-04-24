package net.henryhc.sustech.javajudge.testcases.classdesign

import net.henryhc.sustech.javajudge.sakai.TestCaseJudgeResult
import java.lang.reflect.Modifier

class SetterTestCase(name: String,
                     classNamesToCompile: Set<String>,
                     classNameToCheck: String,
                     private val fieldName: String,
                     private val fieldType: Class<*>,
                     private val modifier: Int = Modifier.PUBLIC
) : ReflectionTestCase(name, classNamesToCompile, classNameToCheck) {

    override fun checkClass(clazz: Class<*>): TestCaseJudgeResult {
        val getter = clazz.declaredMethods
                .singleOrNull {
                    it.name == "set${fieldName.capitalize()}"
                            && it.returnType == Unit::class.java
                            && it.parameterTypes!!.contentEquals(arrayOf(fieldType))
                            && it.modifiers.and(modifier) != 0
                }
        return if (getter == null) {
            TestCaseJudgeResult(0.0, this.name,
                    "Required setter for $fieldName not found.")
        } else {
            TestCaseJudgeResult(1.0, this.name, "Nice Work")
        }
    }
}