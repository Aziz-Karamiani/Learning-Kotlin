package main

fun main(args: Array<String>) {
    val jl = JabehLogger()
    jl.log()
}

class JabehLogger {
    val level: String = "Debug"

    fun log() {
        println("log")
    }

    init {
        println("init block run before every code run.")
    }
}