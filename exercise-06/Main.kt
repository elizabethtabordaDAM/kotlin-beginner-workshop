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

    val producto2 = Product("Lapiz", 1.000, 50)
    val producto3 = Product("Borrador", 500.0, 30)

    println("Producto 1")
    producto1.mostrarInfo()

    println(" Producto 2 ")
    producto2.mostrarInfo()

    println("Producto 3")
    producto3.mostrarInfo()

    val totalGeneral = producto1.valorTotal() + producto2.valorTotal() + producto3.valorTotal()
    println(" Valor total del inventario $totalGeneral")

}