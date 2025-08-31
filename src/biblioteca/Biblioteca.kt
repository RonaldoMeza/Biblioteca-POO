package biblioteca

class Biblioteca {
    val materiales = mutableListOf<Material>()

    fun agregarMaterial(m: Material) {
        materiales.add(m)
        println("Se agregó '${m.titulo}' a la biblioteca.")
    }

    fun mostrarMateriales() {
        println("=== Materiales en Biblioteca ===")
        materiales.forEach { it.mostrarInfo() }
    }
}
