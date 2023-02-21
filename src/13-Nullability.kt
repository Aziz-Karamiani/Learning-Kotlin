package main

fun main(args: Array<String>) {
    val myName: String = "Aziz Karamiani"
    println(myName)
    println(myName.length)

    val catName: String? = null
    println(catName)
    println(catName?.length)

    val amount: Int? = 10
    println(amount?.plus(10))
    println(amount?.minus(5))
    println(amount?.times(10))
    println(amount?.div(2))
    println(amount?.rem(3))
}
