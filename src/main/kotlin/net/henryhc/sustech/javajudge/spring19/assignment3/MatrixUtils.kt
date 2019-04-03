package net.henryhc.sustech.javajudge.spring19.assignment3

fun matrixString(data: Array<Array<Int>>, separator:String = " ") = data.joinToString("\n") { it.joinToString(separator) { it1 -> it1.toString() } }

fun matrixWithSize(matrix: Array<Array<Int>>) = "${matrix.size} ${matrix[0].size}\n${matrixString(matrix)}"