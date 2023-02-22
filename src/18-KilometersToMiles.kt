package main

fun main(args: Array<String>) {
    // 1 kilometer = 0.62 miles
    println("How many kms you should run in a day?")
    val miles = 0.62
    val userInput = readLine()
    try {
        val mks = userInput?.toDouble()
        println("You run ${mks?.times(miles)}")
    } catch (e: Exception) {
        e.printStackTrace()
        println("Invalid Input...")
    } finally {
        println("Done")
    }
}