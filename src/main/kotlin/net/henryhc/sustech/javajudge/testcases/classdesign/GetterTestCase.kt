package net.henryhc.sustech.javajudge.testcases.classdesign

import net.henryhc.sustech.javajudge.sakai.TestCaseJudgeResult
import java.lang.reflect.Modifier

class GetterTestCase(name: String,
                     classNamesToCompile: Set<String>,
                     classNameToCheck: String,
                     private val fieldName: String,
                     private val fieldType: Class<*>,
                     private val modifier: Int = Modifier.PUBLIC
) : ReflectionTestCase(name, classNamesToCompile, classNameToCheck) {

    override fun checkClass(clazz: Class<*>): TestCaseJudgeResult {
        val getter = clazz.declaredMethods
                .singleOrNull {
                    it.name == "get${fieldName.capitalize()}"
                            && it.returnType == fieldType
                            && it.parameterCount == 0
                            && it.modifiers.and(modifier) != 0
                }
        return if (getter == null) {
            TestCaseJudgeResult(0.0, this.name,
                    "Required getter for $fieldName (get${fieldName.capitalize()}) not found.")
        } else {
            TestCaseJudgeResult(1.0, this.name, "Nice Work")
        }
    }
}