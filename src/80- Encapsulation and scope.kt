package main

fun main(args: Array<String>) {

}

open class Airplane {
    private val name: String = "Generic Name"
    protected val topSpeed: Int = 1000
    public val height: Int = 20000

    internal open fun info() {
        println("Name: $name -- Speed: $topSpeed -- Height: $height")
    }
}

class Boeing: Airplane() {
    override fun info() {
//        println("$name") private *
        println("$height")
        println("$topSpeed")
    }
}