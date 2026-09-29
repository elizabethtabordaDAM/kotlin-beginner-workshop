package exercise08

// recibe un nombre que puede ser null y devuelve un saludo
fun saludar(usuario: String?): String {
    if (usuario == null|| usuario == "") {
        return "Hola, bienvenido"
    } else {
        return "Hola, " + usuario
    }
}



fun main() {
    println(saludar("Eliza"))
    println(saludar(null))
    println(saludar(""))
    println(saludar("Santiago"))
}