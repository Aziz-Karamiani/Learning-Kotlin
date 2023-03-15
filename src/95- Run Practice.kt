fun main(args: Array<String>) {
    Laptop().run {
        turnOn()
        turnOff()
        this
    }
}

class Laptop {
    fun turnOn() {
        println("Turn On Laptop")
    }

    fun turnOff() {
        println("Turn Off Laptop")
    }
}