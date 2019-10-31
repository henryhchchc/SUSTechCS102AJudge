package net.henryhc.sustech.javajudge.testcases.classdesign

import net.henryhc.sustech.javajudge.answercheckers.AnswerChecker
import net.henryhc.sustech.javajudge.sakai.TestCaseJudgeResult
import java.lang.reflect.Array
import java.lang.reflect.InvocationTargetException
import java.util.*
import kotlinx.coroutines.*

class CallMethodTestCase(
        name: String,
        classNamesToCompile: Set<String>,
        classNameToCheck: String,
        private val methodToCall: String,
        private val paramType: List<Class<*>>,
        private val inputParams: List<Any>,
        private val answerChecker: AnswerChecker
) : ReflectionTestCase(name, classNamesToCompile, classNameToCheck) {
    @ExperimentalCoroutinesApi
    override fun checkClass(clazz: Class<*>): TestCaseJudgeResult =
            runBlocking {
                try {
                    val job = GlobalScope.async {
                        val method = clazz.getDeclaredMethod(methodToCall, *paramType.toTypedArray())
                        val output = method.invoke(clazz, *inputParams.toTypedArray())
                        return@async output
                    }
                    delay(2000L)
                    if (!job.isCompleted) {
                        job.cancel()
                        return@runBlocking TestCaseJudgeResult(0.0, name, "Time out")
                    } else {
                        return@runBlocking answerChecker.check(job.getCompleted())
                    }
                } catch (e: NoSuchMethodException) {
                    return@runBlocking TestCaseJudgeResult(0.0, name, "Method $methodToCall does not exists.")
                } catch (e: InvocationTargetException) {
                    return@runBlocking TestCaseJudgeResult(0.0, name, "Method $methodToCall is not static.")
                } catch (e: IllegalArgumentException) {
                    return@runBlocking TestCaseJudgeResult(0.0, name, "Method $methodToCall does not have the expected parameter list.")
                } catch (e: IllegalAccessException) {
                    return@runBlocking TestCaseJudgeResult(0.0, name, "Method $methodToCall does not have the expected access modifier.")
                }
            }
}
