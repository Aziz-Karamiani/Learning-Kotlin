fun main(args: Array<String>) {
    /*
      A class Father has a first name and last name. It also has a function that prints out the person’s name.
      A class Son inherits from Father and overrides the first name. It also overrides the message
       function, which now prints out both the name of the person, and the name of the father.
      Implement this structure in a program.
     */

    val father = Father()
    father.printFullName()

    val son = Son()
    son.printFullName()
}

open class Father {
    open val firstName: String = "Jone"
    val lastName: String = "Doe"

    open fun printFullName() {
        println("My name is $firstName $lastName")
    }
}

class Son : Father() {
    override val firstName: String = "Jane"
    override fun printFullName() {
        println("My name is $firstName $lastName and my father name is ${super.firstName} ${super.lastName}")

    }
}