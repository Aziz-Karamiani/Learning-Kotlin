package main

fun main(args: Array<String>) {
    val music = Music().apply {
        duration = 300
        play()
    }

    println(music)
    println(music::class.java)
    println(music.duration)
    println(music.play())
}

class Music {
    var duration: Int = 100
    fun play() {
        println("Play Music")
    }
}