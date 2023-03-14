fun main(args: Array<String>) {
    val animals = listOf("Zebra", "Mouse", "Cat", "Dog", "Monkey", "Donkey")
    animals.map { it.length }
            .filter { it > 3 }
//            .let(::println)
            .let {
                println(it)
                println("Size of list is ${it.size}")
            }

    // Common use case for let noun null
    val name = readLine()
    name?.let { println(it) }
}