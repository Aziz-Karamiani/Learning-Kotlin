package main

fun main(args: Array<String>) {
    for (i in 0 until 10)
        helloWorld()

    for (i in 1..5)
        multiplyNumber()
}

fun helloWorld() {
    println("Hello World.")
}

fun multiplyNumber() {
    println("Please enter a number")
    val usrInput = readLine() ?: ""
    val number = usrInput.toInt()
    println("$number * 17 = ${number * 17}")
}