package main

fun main(args: Array<String>) {
    val myName: String = "Aziz Karamiani"
    println(myName)
    println(myName.length)

    val catName: String? = null
    println(catName)
    println(catName?.length)
}
