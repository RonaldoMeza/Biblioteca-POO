package biblioteca

fun main() {
    val biblio = Biblioteca()

    val libro = Libro("L1", "El Principito", autor = "Antoine de Saint-Exupéry")
    libro.paginas = 120

    val revista = Revista("R1", "National Geographic", numero = 202)
    revista.paginas = 80

    biblio.agregarMaterial(libro)
    biblio.agregarMaterial(revista)

    biblio.mostrarMateriales()

    libro.leer()
    revista.leer()
}
