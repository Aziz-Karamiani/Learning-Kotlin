fun main(args: Array<String>) {
    val mom = Mom(52)
    println("Mom hair color is ${mom.hairColor}")
    println("Mom eye color is ${mom.eyeColor}")
    mom.say("Hello World")

    val daughter = Daughter(22)
    println("Daughter hair color is ${daughter.hairColor}")
    println("Daughter eye color is ${daughter.eyeColor}")
    daughter.say("Hello World")


}

open class Mom(age: Int) {
    open val hairColor: String = "Brown"
    val eyeColor: String = "Black"

    open fun say(message: String) {
        println("Mom say $message")
    }
}

class Daughter(age: Int) : Mom(age) {
    override val hairColor: String = "Black"
    override fun say(message: String) {
        super.say("$message From Daughter Class")
        println("Daughter say $message")
    }
}