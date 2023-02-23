package main

fun main(args: Array<String>) {
    val colors = arrayListOf("Blue", "Red", "Green")
    println(colors)

    colors.set(1, element = "Pink")
    println(colors)

    val subColors = colors.subList(0,2)
    println(subColors)

    println(colors.isEmpty())
    colors.clear()
    println(colors)

    println(colors.isEmpty())
}