package exercise06

class Product(val nombre: String, val precio: Double, val cantidad: Int) {

    // calcular cuanto vale el inventario del producto
    fun valorTotal(): Double {
        return precio * cantidad
    }

    // muestra la informacion del producto
    fun mostrarInfo() {
        println("Producto: " + nombre)
        println("Precio: " + precio)
        println("Cantidad: " + cantidad)
        println("Valor total: " + valorTotal())
    }
}

fun main() {
    val producto1 = Product("Cuaderno", 5.000, 20)

    producto1.mostrarInfo()
}