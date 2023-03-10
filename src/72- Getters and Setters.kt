package main

fun main(args: Array<String>) {
    val myCar = IranianCar()
    println(myCar.name)
    println(myCar.speed)

    myCar.speed = 75
    println(myCar.name)
    println(myCar.speed)
}

class IranianCar {
    var name: String = "Generic Name"
    var speed: Int = 0
        get() = 100
        set(value) {
            name = "$name with {$value} speed ($speed)"
            field = value
        }

}