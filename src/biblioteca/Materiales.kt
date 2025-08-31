package biblioteca

// Interfaz con acción común
interface AccionLectura {
    fun leer()
}

// Subclase Libro
class Libro(
    override val id: String,
    override var titulo: String,
    override val tipo: String = "Libro",
    var autor: String
) : Material(id, titulo), AccionLectura {

    override fun leer() {
        println("Leyendo el libro '$titulo' de $autor...")
    }

    override fun mostrarInfo() {
        super.mostrarInfo()
        println("Autor: $autor")
    }
}

// Subclase Revista
class Revista(
    override val id: String,
    override var titulo: String,
    override val tipo: String = "Revista",
    var numero: Int
) : Material(id, titulo), AccionLectura {

    override fun leer() {
        println("Leyendo la revista '$titulo' número $numero...")
    }

    override fun mostrarInfo() {
        super.mostrarInfo()
        println("Número: $numero")
    }
}
