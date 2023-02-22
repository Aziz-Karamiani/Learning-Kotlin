package main

fun main(args: Array<String>) {
    println("Handling Exceptions....")

    val amount = readLine()
    try {
        println(amount?.toInt())
    }catch (e: Exception) {
        e.printStackTrace()
        println("Error : ${e.localizedMessage}")
    }
}