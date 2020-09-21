package aula11.ex1

fun main() {
    val pessoa1 = Pessoa("Anthony","12345")
    val pessoa2 = Pessoa("Anthony","12345")

    println(pessoa1.equals(pessoa2))
    //Inicialmente retornou false
    //Após sobrescrever retornou true
}