package aula12.ex4

abstract class Peca(private val marca: String, private val modelo: String) {

    abstract fun retirada()

    override fun toString(): String {
        return "Peca(marca='$marca', modelo='$modelo')"
    }
}