fun main(args: Array<String>) {
    val numbers = setOf(1, 2, 3, 4, 5)
    println(numbers.size)
    println(numbers.contains(2))
    println(numbers.contains(6))

    val numbers2 = setOf(4, 5)
    val numbers3 = setOf(5, 6)
    println(numbers.containsAll(numbers2))
    println(numbers.containsAll(numbers3))

    println(numbers.isEmpty())
}