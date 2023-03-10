package main

fun main(args: Array<String>) {
    val table = Table()
    table.tableInfo()

    table.updateDimensions(600, 300)
    table.tableInfo()
}

class Table {
    var width: Int = 300
    var height: Int = 200

    fun updateDimensions(width: Int, height: Int) {
        this.width = width
        this.height = height
    }

    fun tableInfo() {
        println("Table width is $width and height is $height")
    }
}