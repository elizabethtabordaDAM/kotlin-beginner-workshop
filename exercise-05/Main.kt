package exercise05

// dice si un numero es primo
fun isPrime(numero: Int): Boolean {
    if (numero < 2) {
        return false
    }
    for (i in 2 until numero) {
        if (numero % i == 0) {
            return false
        }
    }
    return true
}

// calcula el factorial
fun factorial(numero: Int): Int {
    var resultado = 1
    for (i in 1..numero) {
        resultado = resultado * i
    }
    return resultado
}

// dice si un numero es par
fun isEven(numero: Int): Boolean {
    return numero % 2 == 0
}

fun main() {
    val numero = listOf(5, 1, 6, 7, 10, -3)
    for (numero in numero) {
        println("Numero: " + numero)
        println("Es primo: " + isPrime(numero))
        if (numero >= 0) {
            println("Factorial: " + factorial(numero))
        } else {
            println("Factorial: no existe para negativos")
        }
        println("Es par: " + isEven(numero))
    }

}