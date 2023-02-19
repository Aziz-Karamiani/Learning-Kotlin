package main

fun main(args: Array<String>) {
    val byteNumber: Byte = 12
    println(byteNumber::class.java)

    val shortNumber: Short = 123
    println(shortNumber::class.java)

    val intNumber: Int = 1234
    println(intNumber::class.java)

    val longNumber: Long = 12345
    println(longNumber::class.java)

    val longNumber2 = 123456L
    println(longNumber2::class.java)

    val floatNumber: Float = 12.12F
    println(floatNumber::class.java)

    val doubleNumber: Double = 12.12
    println(doubleNumber::class.java)
}