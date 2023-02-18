package main

import kotlin.random.Random


fun main(args: Array<String>) {
    println(Random.nextInt())
    println(Random.nextInt(100))
    println(Random.nextInt(100, 200))

    println(Random.nextBoolean())

    println(Random.nextDouble())
    println(Random.nextDouble(500.0))

    println(Random.nextBytes(1))
    println(Random.nextBits(1))
}