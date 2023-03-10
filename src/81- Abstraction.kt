package abstraction

fun main(args: Array<String>) {
    /*
     A class Dog can run, bark and play.
     A Pug can run and play but cannot bark.
     A Basset Hound can bark and play but cannot run.
     An old Chihuahua can bark and run but cannot play.
     Implement this in a program and print out what each dog breed can and cannot do.
     */
    val myDog: Dog = Pug("Pug")
    val yourDog: Dog = Basset("Basset")
    val hisDog: Dog = Chihuahua("Chihuahua")

    myDog.run()
    myDog.bark()
    myDog.play()

    yourDog.run()
    yourDog.bark()
    yourDog.play()

    hisDog.run()
    hisDog.bark()
    hisDog.play()
}

abstract class Dog(name: String) {
    abstract fun run()
    abstract fun bark()
    abstract fun play()
}

class Pug(val name: String) : Dog(name) {
    override fun run() {
        println("$name can run.")
    }

    override fun bark() {
        println("$name can not bark.")
    }

    override fun play() {
        println("$name can play.")
    }
}


class Basset(val name: String) : Dog(name) {
    override fun run() {
        println("$name can not run.")
    }

    override fun bark() {
        println("$name can bark.")
    }

    override fun play() {
        println("$name can play.")
    }
}

class Chihuahua(val name: String) : Dog(name) {
    override fun run() {
        println("$name can run.")
    }

    override fun bark() {
        println("$name can bark.")
    }

    override fun play() {
        println("$name can not play.")
    }
}