package biblioteca

fun main() {
    // Crear libro
    val libro = Libro("L1", "El Principito", autor = "Antoine de Saint-Exupéry")
    libro.paginas = 120  // usa setter validado
    libro.mostrarInfo()
    libro.leer()

    println()

    // Crear revista
    val revista = Revista("R1", "National Geographic", numero = 202)
    revista.paginas = 80
    revista.mostrarInfo()
    revista.leer()
}
