package aula7.ex5

class Cliente (val nome: String, val sobreNome: String, val contato: String) {
    override fun toString(): String {
        return "$nome $sobreNome (contado: $contato)"
    }
}