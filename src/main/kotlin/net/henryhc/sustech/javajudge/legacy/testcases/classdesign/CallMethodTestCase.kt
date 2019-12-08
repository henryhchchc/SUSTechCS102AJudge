package net.henryhc.sustech.javajudge.legacy.testcases.classdesign

import net.henryhc.sustech.javajudge.answercheckers.AnswerChecker
import net.henryhc.sustech.javajudge.sakai.TestCaseJudgeResult
import java.lang.reflect.InvocationTargetException
import kotlinx.coroutines.*
import java.lang.Thread.sleep

class CallMethodTestCase(
        name: String,
        classNamesToCompile: Set<String>,
        classNameToCheck: String,
        private val methodToCall: String,
        private val paramType: List<Class<*>>,
        private val inputParams: List<Any>,
        private val answerChecker: AnswerChecker,
        @Volatile private var res: Any = "Time out or other error."
) : ReflectionTestCase(name, classNamesToCompile, classNameToCheck) {
    init {
        answerChecker.caseName = name
    }

    fun invokeMethod(clazz: Class<*>, methodToCall: String, inputParams: List<Any>): Any {
        val method = clazz.getDeclaredMethod(methodToCall, *paramType.toTypedArray())
        val output = method.invoke(clazz, *inputParams.toTypedArray())
        return output
    }
    override fun checkClass(clazz: Class<*>): TestCaseJudgeResult {
        try {
            val job = GlobalScope.async {
                res = invokeMethod(clazz, methodToCall, inputParams)
            }
            sleep(2000L)
            job.cancel()
            if(res is String)
                return TestCaseJudgeResult(0.0, name, res as String)
            else
                return answerChecker.check(res)
        } catch (e: NoSuchMethodException) {
            return TestCaseJudgeResult(0.0, name, "Method $methodToCall does not exists.")
        } catch (e: InvocationTargetException) {
            return TestCaseJudgeResult(0.0, name, "Method $methodToCall is not static.")
        } catch (e: IllegalArgumentException) {
            return TestCaseJudgeResult(0.0, name, "Method $methodToCall does not have the expected parameter list.")
        } catch (e: IllegalAccessException) {
            return TestCaseJudgeResult(0.0, name, "Method $methodToCall does not have the expected access modifier.")
        }
    }
}
