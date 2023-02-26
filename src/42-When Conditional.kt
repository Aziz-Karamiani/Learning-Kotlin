package main

fun main(args: Array<String>) {
    println("Please Enter A Number?")
    val userInput = readLine() ?: "0"
    val dayNumber = userInput.toInt()
    var dayOfWeek = ""
    when (dayNumber) {
        1 -> dayOfWeek = "Saturday"
        2 -> dayOfWeek = "Sunday"
        3 -> dayOfWeek = "Monday"
        4 -> dayOfWeek = "Tuesday"
        5 -> dayOfWeek = "Wednesday"
        6 -> dayOfWeek = "Thursday"
        7 -> dayOfWeek = "Friday"
        else -> dayOfWeek = "Invalid Day Number."
    }

    println("Your Favourite Day Is $dayOfWeek")
}