package exercise01

fun main() {
    val a = 10.0
    val b = 20.0
    val operation = '*'

    val result = when (operation) {
        '+' -> a + b
        '-' -> a - b
        '*' -> a * b
        '/' -> a / b
        else -> 0.0
    }

    println("$a $operation $b = $result")

}