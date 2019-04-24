package net.henryhc.sustech.javajudge.testcases.classdesign

import net.henryhc.sustech.javajudge.sakai.TestCaseJudgeResult
import java.lang.reflect.Method
import java.lang.reflect.Modifier

class MethodTestCase(
        name: String,
        classNamesToCompile: Set<String>,
        classNameToCheck: String,
        private val methodName: String,
        private val returnType: Class<*>,
        private val parameterTypes: List<Class<*>>,
        private val modifiers: Int = Modifier.PUBLIC
) : ReflectionTestCase(name, classNamesToCompile, classNameToCheck) {
    override fun checkClass(clazz: Class<*>): TestCaseJudgeResult {
        val method = clazz.declaredMethods
                .singleOrNull {
                    it.name == methodName
                            && it.modifiers.and(modifiers) != 0
                            && it.returnType == returnType
                            && it.parameterTypes!!.contentEquals(parameterTypes.toTypedArray())
                }
        return if (method == null) {
            TestCaseJudgeResult(0.0, this.name,
                    "Required method not found:\n" +
                            "${returnType.simpleName} $methodName" +
                            "(${parameterTypes.joinToString(", ") { it.simpleName }})")
        } else {
            TestCaseJudgeResult(1.0, this.name, "Nice Work")
        }
    }

    private fun Method.isStatic() = this.modifiers.and(Modifier.STATIC) != 0
}