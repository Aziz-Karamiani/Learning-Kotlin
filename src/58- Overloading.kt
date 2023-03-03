package main

fun main(args: Array<String>) {
    println("10 * 2 = ${multiply(10)}")
    println("10 * 2 = ${multiply(10, 2)}")

    sayHello("Aziz")
    sayHello(listOf("Aziz", "Meysam", "Mina", "Reza"))
}

fun multiply(number: Int) = number * 2
fun multiply(number: Int, multiplier: Int) = number * multiplier

fun sayHello(person: String) {
    println("Hello $person")
}

fun sayHello(people: Collection<String>) {
    for (person in people) {
        println("Hello $person")
    }
}