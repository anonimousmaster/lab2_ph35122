package com.example.myapplication

fun main() {
    var month = 0
    println("Nhập tháng:")
    val s: String? = readLine()
    if (s != null) month = s.toInt()
    when (month) {
        in 1..3 -> println("Tháng " + month + " thuộc quý 1")
        in 4..6 -> println("Tháng " + month + " thuộc quý 2")
        in 7..9 -> println("Tháng " + month + " thuộc quý 3")
        in 10..12 -> println("Tháng " + month + " thuộc quý 4")
        else -> println("Tháng " + month + " không hợp lệ")
    }
}