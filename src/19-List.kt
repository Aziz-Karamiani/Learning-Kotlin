package main

fun main(args: Array<String>) {
    // List (a collection of ordered lists of
    // items with same type and nullable items)
    // Can contains duplicate items
    // Immutable
    val colors = listOf("Blue", "Red", "Yellow")
    println(colors)

    val colors2 = listOf<String>()
    println(colors2)

    val colors3 = listOf("Blue", "Red", null, "Yellow", null, null)
    println(colors3)

    val colors4 = listOf("Blue", "Red", null, "Red", "Blue", "Yellow", null)
    println(colors4)

    println(colors[0])
    println(colors.get(index = 0))
    println(colors[1])
    println(colors.get(index = 1))

    println(colors.size)
    println(colors2.size)
    println(colors3.size)
    println(colors4.size)
}