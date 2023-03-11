package interfaces

fun main(args: Array<String>) {
    val logger: Logger = ConsoleLogger()
    logger.log("Info")
    logger.log("Info", "Information")
}

interface Logger {
    val level: String

    fun log(level: String)
    fun log(level: String, message: String)
}

class ConsoleLogger : Logger {
    override val level: String = "Debug"

    override fun log(level: String) {
        println(level)
    }

    override fun log(level: String, message: String) {
        println("$level: $message")
    }
}