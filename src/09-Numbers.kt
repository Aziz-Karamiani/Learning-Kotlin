package main

fun main(args: Array<String>) {
    val total = 112450
    val price = 580
    val totalPrice = total * price
    println("Total price is $totalPrice")

    val age = 32
    println(age::class.java)

    val people = 8350000000
    println(people::class.java)

    val grade = 19.7
    println(grade::class.java)

    val pi = 3.1415678654
    println(pi::class.java)
}