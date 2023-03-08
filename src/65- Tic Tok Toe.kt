package main

var board = arrayListOf<ArrayList<String>>()

fun main(args: Array<String>) {
    for (i in 0..2) {
        val row = arrayListOf<String>()
        for (j in 0..2) {
            row.add("")
        }
        board.add(row)
    }

    var continueGame = true
    do {
        println("Please enter a position (eg. 1, 2)")
        val userInput = readLine() ?: ""
        var x = 0
        var y = 0
        try {
            val position = userInput.split(",")
            x = position[0].trim().toInt()
            y = position[1].trim().toInt()
            if (board[x - 1][y - 1] != "") {
                println("This position already taken.")
            } else {
                board[x - 1][y - 1] = "X"
                printBoard()
            }
        } catch (e: Exception) {
            println("Invalid input, please try again.")
        }
    } while (continueGame)
}

fun printBoard() {
    println("-------------")
    for (i in 0..2) {
        for (j in 0..2) {
            when (board[i][j]) {
                "X" -> print("| X ")
                "O" -> print("| O ")
                else -> print("|   ")
            }
        }
        println("|")
        println("-------------")
    }
}