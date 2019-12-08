package net.henryhc.sustech.javajudge.spring19.assignment3

import net.henryhc.sustech.javajudge.sakai.Problem
import net.henryhc.sustech.javajudge.answercheckers.ExactMatchChecker
import net.henryhc.sustech.javajudge.legacy.testcases.io.StdinTestCase
import net.henryhc.sustech.javajudge.legacy.testCasesAverage

private fun a3q1Input(vararg matrices: Array<Array<Int>>) = "${matrices.size}\n${matrices.joinToString("\n") {
    "${it.size} ${it[0].size}\n${matrixString(it)}"
}}"


private val m1 = arrayOf(
        arrayOf(2, 2),
        arrayOf(2, 2),
        arrayOf(2, 2)
)

private val m2 = arrayOf(
        arrayOf(2, 4, 6),
        arrayOf(4, 4, 6),
        arrayOf(8, 2, 9)
)

private val m3 = arrayOf(
        arrayOf(5004996, 161160, 13810148, 9096500, 4566688, 6509916, 3497172, 1787556, 4378626),
        arrayOf(3758832, 251940, 8621547, 8037350, 1043104, 3904271, 12021924, 662460, 3402672),
        arrayOf(9641160, 357867, 3573097, 5524600, 3579232, 5437901, 14233743, 1202202, 5333034),
        arrayOf(11699568, 361590, 2305710, 4870250, 8776992, 6210057, 5424411, 9138690, 2038092),
        arrayOf(284760, 45135, 10099914, 8384650, 9734848, 1036154, 4325616, 7929972, 2503326),
        arrayOf(9904224, 292842, 9828654, 3929550, 8546112, 4591734, 6719250, 688524, 5460714),
        arrayOf(4462596, 395148, 12774839, 4708100, 8599392, 3812711, 3961986, 5875260, 3684366),
        arrayOf(10521204, 89046, 6556957, 3232650, 5054496, 2634639, 3297966, 8517498, 3846360),
        arrayOf(3011676, 383061, 4398933, 3280950, 4103744, 2427866, 8439378, 4633962, 5945100)
)

private val m4 = arrayOf(
        arrayOf(5151444, 4249704, 407589, 1398579, 1444290, 2990091, 6486480, 3160320, 2119285, 5246852),
        arrayOf(7243776, 14471245, 12729318, 634782, 425320, 15317718, 1330560, 2207680, 5692700, 9101560),
        arrayOf(12058812, 2864476, 11502072, 553002, 2989950, 16436277, 2607066, 2558080, 3235175, 7360184),
        arrayOf(5957880, 13062512, 12742755, 1323567, 2542000, 15052752, 11951478, 1547520, 1087200, 9520160),
        arrayOf(7800264, 13286593, 10979522, 972900, 1177690, 4016415, 10895346, 1738880, 1843710, 10265268),
        arrayOf(5530296, 15555609, 6509480, 347424, 1354700, 11235900, 2255022, 2219200, 3213280, 4909580)
)

private val m5 = arrayOf(
        arrayOf(3399225),
        arrayOf(3429420),
        arrayOf(8353035),
        arrayOf(696315),
        arrayOf(8664135),
        arrayOf(1203225),
        arrayOf(7871745),
        arrayOf(5615355)
)

val a3q1 = Problem("A3Q1", testCasesAverage(
        StdinTestCase("Matrix 1, 2", "A3Q1", a3q1Input(m1, m2), ExactMatchChecker("2 2\n2 2 3")),
        StdinTestCase("Matrix 1", "A3Q1", a3q1Input(m1), ExactMatchChecker("2 2")),
        StdinTestCase("Matrix 2", "A3Q1", a3q1Input(m2), ExactMatchChecker("2 2 3")),
        StdinTestCase("Matrix 3, 4, 5", "A3Q1", a3q1Input(m3, m4, m5),
                ExactMatchChecker("1356 51 1507 1150 1184 763 1581 1086 798\n" +
                        "1572 1567 1493 141 310 1677 1386 320 755 1196\n" +
                        "915")),
        StdinTestCase("Matrix 3", "A3Q1", a3q1Input(m3), ExactMatchChecker("1356 51 1507 1150 1184 763 1581 1086 798")),
        StdinTestCase("Matrix 4", "A3Q1", a3q1Input(m4), ExactMatchChecker("1572 1567 1493 141 310 1677 1386 320 755 1196")),
        StdinTestCase("Matrix 5", "A3Q1", a3q1Input(m5), ExactMatchChecker("915"))
))
