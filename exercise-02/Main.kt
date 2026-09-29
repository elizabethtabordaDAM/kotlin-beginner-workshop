package exercise02

fun main() {
    val name = "Elizabeth"
    println("Estudiante: $name")

    val calificacion1= 3.0
    val calificacion2= 4.0
    val calificacion3= 3.5

    val promedio = (calificacion1 + calificacion2+calificacion3)/3
    println("El promedio del estudiante $name es $promedio")

    // 1. Aprobado o reprobado
    if (promedio >= 3.0) {
        println("Estado: Aprobado")
    } else {
        println("Estado: Reprobado")
    }

    // 2. Excelente (revisión aparte)
    if (promedio >= 4.5) {
        println("¡Obtuvo un promedio excelente!")
    }
}

