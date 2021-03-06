package aula11.ex1

class Pessoa(val nome: String, val rg: String) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Pessoa

        if (rg != other.rg) return false

        return true
    }

    override fun hashCode(): Int {
        return rg.hashCode()
    }
}