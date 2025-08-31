package biblioteca

// Data class: registro de préstamo
data class Prestamo(val idMaterial: String, val usuario: String, val fecha: String)

class Biblioteca {
    val materiales = mutableListOf<Material>()
    val prestamos = mutableListOf<Prestamo>()

    fun agregarMaterial(m: Material) {
        materiales.add(m)
        println("Se agregó '${m.titulo}' a la biblioteca.")
    }

    fun mostrarMateriales() {
        println("=== Materiales en Biblioteca ===")
        materiales.forEach { it.mostrarInfo() }
    }

    fun prestarMaterial(id: String, usuario: String, fecha: String) {
        val material = materiales.find { it.id == id }
        if (material != null) {
            val prestamo = Prestamo(id, usuario, fecha)
            prestamos.add(prestamo)
            println("Se prestó '${material.titulo}' a $usuario el $fecha")
        } else {
            println("No se encontró material con id $id")
        }
    }
}
