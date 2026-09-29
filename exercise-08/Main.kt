package exercise08

// recibe un nombre que puede ser null y devuelve un saludo
fun saludar(usuario: String?): String {
    if (usuario == null) {
        return "Hola, bienvenido"
    } else {
        return "Hola, " + usuario
    }
}

fun main() {
    println(saludar("Eliza"))
    println(saludar(null))
}