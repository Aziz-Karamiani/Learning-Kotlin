package main

fun main(args: Array<String>) {
    val greeting = {name: String -> println("Hello $name")}

    greeting("Aziz")
    greeting("Reza")
    greeting("Mina")
    greeting("Amir")
}