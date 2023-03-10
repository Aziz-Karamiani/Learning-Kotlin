package main

fun main(args: Array<String>) {
    println(SanjaghLogger.message)
    SanjaghLogger.logger()
}

class SanjaghLogger {
    val level: String = "Debug"

    companion object {
        val message: String = "SanjaghLogger"
        fun logger() {
            println("Sanjagh Logger")
        }
    }
}