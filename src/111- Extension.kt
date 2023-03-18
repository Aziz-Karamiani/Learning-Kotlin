fun main(args: Array<String>) {
    val name = "Michael"
    println(name.slim())

    println(name.betterLength)
}

fun String.slim() = this.substring(1, length - 1)

val String.betterLength: Int
    get() = 200