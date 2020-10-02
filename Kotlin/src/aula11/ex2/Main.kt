package aula11.ex2

fun main() {
    val coca1 = Coca(12,10.0)
    val coca2 = Coca(12,11.0)

    println(coca1.equals(coca2))
    //Inicialmente retornou false
    //Após sobrescrever retornou true
}