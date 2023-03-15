package main

fun main(args: Array<String>) {
    Video().run {
        name = "Sniper III"
        duration = 4200
        extension = "mp4"
        play()
        stop()
        pause()
        reset()
//        this
    }

    run {
        val video1 = Video()
        video1.pause()
        video1.play()
    }

//    println(video1)
}

class Video {
    var name: String = "Default Name"
    var duration: Int = 3600
    var extension: String = "mp4"

    fun play() {
        println("Play")
    }

    fun stop() {
        println("Stop")
    }

    fun pause() {
        println("Pause")
    }

    fun reset() {
        println("Reset")
    }
}