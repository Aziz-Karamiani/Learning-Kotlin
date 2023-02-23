package main

fun main(args: Array<String>) {
    /*
        A zoo has a list of animals.
        val animals = arrayListOf("lion", "zebra", "chimp", "elephant")
        A new panda bear cub has arrived.
        Print out the new list of animals.
        The lion has been sold to a different zoo.
        Print out the new list of animals.
        Does the zoo have both elephants and giraffes?
     */
    val animals = arrayListOf("lion", "zebra", "chimp", "elephant")
    println(animals)
    println(animals.size)
    println("--------------------------------")

    animals.add("panda")
    animals.add("bear")
    animals.add("cub")
    println(animals)
    println(animals.size)
    println("--------------------------------")

    animals.remove("lion")
    println(animals)
    println(animals.size)
    println("--------------------------------")

    println(animals.containsAll(arrayListOf("elephant", "giraffe")))
    println(animals.containsAll(listOf("elephant", "giraffe")))
}