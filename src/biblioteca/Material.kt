package biblioteca

// Clase abstracta
abstract class Material(
    open val id: String,
    open var titulo: String
) {
    abstract val tipo: String

    // Ejemplo de setter: validar número de páginas
    open var paginas: Int = 0
        set(value) {
            field = if (value < 0) 0 else value
        }

    // Getter calculado: material "grueso" si tiene más de 300 páginas
    val esGrueso: Boolean
        get() = paginas > 300

    init {
        println("Se creó el material '$titulo'")
    }

    open fun mostrarInfo() {
        println("[$tipo] $titulo ($paginas páginas)")
    }
}
