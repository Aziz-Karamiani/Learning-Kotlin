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

    val test = readLine()
    try {
        println(test?.toInt())
    } catch (e: Exception) {
        println("An exception has occurred\n${e.localizedMessage}")
    } finally {
        println("The execution has completed")
    }
}