package net.henryhc.sustech.javajudge.testcases.classdesign

import net.henryhc.sustech.javajudge.sakai.TestCaseJudgeResult
import java.lang.reflect.Modifier

class FieldTestCase(
        name: String,
        classNamesToCompile: Set<String>,
        classNameToCheck: String,
        private val fieldName: String,
        private val fieldType: Class<*>,
        private val modifier: Int = Modifier.PRIVATE
) : ReflectionTestCase(name, classNamesToCompile, classNameToCheck) {

    override fun checkClass(clazz: Class<*>): TestCaseJudgeResult {
        val field = clazz.declaredFields
                .singleOrNull {
                    it.name == fieldName
                            && it.type == fieldType
                            && it.modifiers.and(modifier) != 0
                }
        return if (field == null) {
            TestCaseJudgeResult(0.0, this.name,
                    "Required field not found:\n" +
                            "${fieldType.simpleName} $fieldName")
        } else {
            TestCaseJudgeResult(1.0, this.name, "Nice Work")
        }
    }

}