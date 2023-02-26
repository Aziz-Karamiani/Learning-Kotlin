package main

fun main(args: Array<String>) {
    val month = "January"
    val days = when(month) {
            "January", "March", "May" -> 31
            "February" -> 28
        else -> 30
    }

    println(days)
}