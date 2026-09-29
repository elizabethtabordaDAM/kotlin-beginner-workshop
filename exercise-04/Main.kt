package exercise04

fun main() {
    val numeros = listOf(11, 2, 25, 3, 4, 27, 9, 31, 14, 6)
    var suma = 0
    var mayor = numeros[0]
    var menor = numeros[0]
    var pares = 0
    var impares = 0


    println("Elementos de la lista:")
    for (n in numeros) {
        println(n)
    }

    for (n in numeros) {
        suma = suma + n

        if (n > mayor) {
            mayor = n
        }
        if (n < menor) {
            menor = n
        }

        if (n % 2 == 0) {
            pares = pares + 1
        } else {
            impares = impares + 1
        }
    }

    // promedio
    val promedio = suma.toDouble() / numeros.size

    println("Suma: " + suma)
    println("Promedio: " + promedio)
    println("Mayor: " + mayor)
    println("Menor: " + menor)
    println("Cantidad de pares: " + pares)
    println("Cantidad de impares: " + impares)
}