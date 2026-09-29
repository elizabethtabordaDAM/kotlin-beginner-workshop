package exercise07

class Contact(val nombre: String, val telefono: String, val correo: String) {

    // muestra los datos del contacto
    fun mostrar() {
        println("Nombre: " + nombre + " | Telefono: " + telefono + " | Correo: " + correo)
    }
}

fun main() {
    val agenda = mutableListOf<Contact>()

    agenda.add(Contact("ELIZA", "3001112233", "eliza@gmail.com"))
    agenda.add(Contact("SANTIAGO", "3104445566", "santi@gmail.com"))
    agenda.add(Contact("ARACELLY", "3207778899", "ara@gmail.com"))
    agenda.add(Contact("JHONY", "3151234567", "jhony@gmail.com"))
    agenda.add(Contact("ELVIA", "3169876543", "elvia@gmail.com"))

    println("Contactos:")
    for (c in agenda) {
        c.mostrar()
    }
}