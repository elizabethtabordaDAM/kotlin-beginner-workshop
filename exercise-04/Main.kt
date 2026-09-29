package exercise04

fun main() {
    val numeros = listOf(11, 7, 25, 3, 18, 27, 9, 31, 14, 6)


    println("Elementos de la lista:")
    for (n in numeros) {
        println(n)
    }

    // suma
    var suma = 0
    for (n in numeros) {
        suma = suma + n
    }

    // promedio
    val promedio = suma.toDouble() / numeros.size

    println("Suma: " + suma)
    println("Promedio: " + promedio)
}