package main

fun main(args: Array<String>) {
    sayHello("Aziz")
    println("---------------------")
    sayHello("Aziz", "Meysam")
    println("---------------------")
    sayHello("Aziz", "Meysam", "Reza")
    println("---------------------")
    sayHello("Aziz", "Meysam", "Reza", "Mina")
}

fun sayHello(vararg names: String) {
    for (name in names) {
        println("Hello $name")
    }
}