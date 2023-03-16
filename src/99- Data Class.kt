fun main(args: Array<String>) {
    val user = User("Aziz", "Password")
    println(user)
    println(user::class.java)
}

data class User(val userName: String, val password: String)

