package biblioteca

// Clase abstracta base
abstract class Material(
    open val id: String,
    open val titulo: String
) {
    abstract val tipo: String

    // Setter validado: no permite páginas negativas
    open var paginas: Int = 0
        set(value) {
            field = if (value < 0) 0 else value
        }

    // Getter calculado: define si el material es grueso
    val esGrueso: Boolean
        get() = paginas > 300

    init {
        println("Se creó el material")
    }

    open fun mostrarInfo() {
        println("[$tipo] $titulo ($paginas páginas)")
        if (esGrueso) {
            println("Este material es grueso.")
        }
    }
}
