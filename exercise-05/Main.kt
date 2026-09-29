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
    val numero = 7

    println("Numero: " + numero)
    println("Es primo: " + isPrime(numero))
    println("Factorial: " + factorial(numero))
    println("Es par: " + isEven(numero))
}