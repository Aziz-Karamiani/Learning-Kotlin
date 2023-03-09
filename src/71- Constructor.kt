package constructor

fun main(args: Array<String>) {
    val bmv = Car("BMV", 4, 2)
    bmv.print()

    val ford = Car("Ford", 4)
    ford.print()

    val benz = Car("Ben")
    benz.print()

    val pride = Car()
    pride.print()
}

//class Car(var model: String, var numberOfWheels: Int, var numberOfDoors: Int) {
//    fun print() {
//        println("$model car has $numberOfWheels wheels and $numberOfDoors doors.")
//    }
//}

class Car {
    var model: String = "Generic Car"
    var numberOfWheels: Int = 4
    var numberOfDoors: Int = 4

    constructor() {
    }

    constructor(model: String) {
        this.model = model
    }

    constructor(model: String, numberOfWheels: Int) {
        this.model = model
        this.numberOfWheels = numberOfWheels
    }

    constructor(model: String, numberOfWheels: Int, numberOfDoors: Int) {
        this.model = model
        this.numberOfWheels = numberOfWheels
        this.numberOfDoors = numberOfDoors
    }

    fun print() {
        println("$model car has $numberOfWheels wheels and $numberOfDoors doors.")
    }
}