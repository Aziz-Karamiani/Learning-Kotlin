package main

fun main(args: Array<String>) {
    // ArrayList (Mutable List)
    val colors = arrayListOf("Blue", "Red")
    println(colors)
    val noColors = arrayListOf<String>()
    println(noColors)

    colors.add("Yellow")
    colors.add("Blue")
    println(colors)

    val moreColors = arrayListOf("Pink", "Orange", "Teal")
    colors.addAll(moreColors)
    println(colors)

    colors.remove("Yellow")
    println(colors)

    colors.remove("Blue")
    println(colors)

    colors.removeAll(moreColors)
    println(colors)

    colors.removeAt(1)
    println(colors)
}