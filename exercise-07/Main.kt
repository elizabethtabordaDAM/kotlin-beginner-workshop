package exercise07

class Contact(val nombre: String, val telefono: String, val correo: String) {

    // muestra los datos del contacto
    fun mostrar() {
        println("Nombre: " + nombre + " | Telefono: " + telefono + " | Correo: " + correo)
    }
}

fun agregar(agenda: MutableList<Contact>, contacto: Contact) {
    agenda.add(contacto)
    println("Se agrego a " + contacto.nombre)
}

// muestra todos los contactos
fun listar(agenda: MutableList<Contact>) {
    if (agenda.isEmpty()) {
        println("La agenda esta vacia")
    } else {
        for (c in agenda) {
            c.mostrar()
        }
    }
}

fun buscar(agenda: MutableList<Contact>, nombre: String) {
    var encontrado = false

    for (c in agenda) {
        if (c.nombre == nombre) {
            c.mostrar()
            encontrado = true
        }
    }

    if (encontrado == false) {
        println("El contacto " + nombre + " no existe")
    }
}

// elimina un contacto por nombre
fun eliminar(agenda: MutableList<Contact>, nombre: String) {
    var posicion = -1

    for (i in 0 until agenda.size) {
        if (agenda[i].nombre == nombre) {
            posicion = i
        }
    }

    if (posicion == -1) {
        println("El contacto " + nombre + " no existe")
    } else {
        agenda.removeAt(posicion)
        println("Se elimino a " + nombre)
    }
}


fun main() {
    val agenda = mutableListOf<Contact>()

    agenda.add(Contact("ELIZA", "3001112233", "eliza@gmail.com"))
    agenda.add(Contact("SANTIAGO", "3104445566", "santi@gmail.com"))
    agenda.add(Contact("ARACELLY", "3207778899", "ara@gmail.com"))
    agenda.add(Contact("JHONY", "3151234567", "jhony@gmail.com"))
    agenda.add(Contact("ELVIA", "3169876543", "elvia@gmail.com"))

    println("--- Lista completa ---")
    listar(agenda)

    println("--- Buscar a ELIZA ---")
    buscar(agenda, "ELIZA")

    println("--- Buscar a ESTELLA (no existe) ---")
    buscar(agenda, "ESTELLA")

    println("--- Eliminar a ELIZA---")
    eliminar(agenda, "ELIZA")

    println("--- Eliminar a ARACELLY  ---")
    eliminar(agenda, "ARACELLY")

    println("--- Lista final ---")
    listar(agenda)
}