package main

fun main(args: Array<String>) {
    println("Hello Strings..")
    // String with " and \ scape
    println("The answer is \"yes\" and you can proceed.!")

    // Chars in the '
    println('A')

    val url: String = "https://google.com"
    println(url)

    val sentence: String = "My cat’s name is \"Fluffy\""
    println(sentence)

    val sentence2: String = "The type of slash are: \\ and /"
    println(sentence2)

    // Draw bunny
    println("(\\(\\")
    println("(-.-)")
    println("O_(\") (\")")

    // String Functions
    var str = "this is a kotlin program."
    println(str.length)
    println(str.capitalize())
    str = "This Is A Kotlin Program."
    println(str.decapitalize())

    println(str.toUpperCase())
    println(str.toLowerCase())

    println(str.substring(3))
    println(str.substring(3, 6))
}