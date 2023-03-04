package main

fun main(args: Array<String>) {
    val names = arrayListOf("Aziz", "Mina", "Reza", "Matin")
    greeting(names) { name: String -> println("Hello, $name") }
}

fun greeting(names: Collection<String>, sayHello: (String) -> Unit) {
    for (name in names) {
        sayHello(name)
    }
}