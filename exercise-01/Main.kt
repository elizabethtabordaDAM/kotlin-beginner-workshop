package exercise01

fun main() {
    val a = 20.0
    val b = 00.0
    val operation = '/'

    val result: Double? = when (operation) {
        '+' -> a + b
        '-' -> a - b
        '*' -> a * b
        '/' -> if (b == 0.0) null else a / b
        else -> null
    }

    if (result == null) {
        if (operation == '/' && b == 0.0) {
            println("Error: no se puede dividir entre cero")
        } else {
            println("Error: operación '$operation' no válida")
        }
    } else {
        println("$a $operation $b = $result")
    }

}