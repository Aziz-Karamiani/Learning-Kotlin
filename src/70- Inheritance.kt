package main

fun main(args: Array<String>) {
    val d = Dog()
    d.bark()
    d.play()

    val g = Gorgi()
    g.bark()
    g.play()
}

open class Dog {
    fun bark() {
        println("Bark")
    }

    fun play() {
        println("Play")
    }
}

class Gorgi : Dog() {

}