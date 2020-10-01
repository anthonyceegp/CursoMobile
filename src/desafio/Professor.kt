package desafio

abstract class Professor(var nome: String, var sobrenome: String, var tempoCasa: Int, val codigo: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Professor) return false

        if (codigo != other.codigo) return false

        return true
    }

    override fun hashCode(): Int {
        return codigo
    }
}