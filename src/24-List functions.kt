package main

fun main(args: Array<String>) {
    val colors = listOf("Blue", "Red", "Green", "Blue", "Yellow")
    println(colors)

    println(colors.contains("Blue"))
    println(colors.contains("blue"))
    println(colors.contains("Pink"))

    val specificColors = listOf("Red", "Green")
    println(colors.containsAll(specificColors))

    println(colors.indexOf("Blue"))
    println(colors.lastIndexOf("Blue"))
}