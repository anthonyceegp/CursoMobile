package aula11.ex6

fun main() {
    val listaStrings = ArrayList<String>()
    try {
        listaStrings.add("Pato")
        listaStrings.add("Cachorro")
        listaStrings.add("Gato")
        print(listaStrings[5])
    } catch (e: Exception) {
        println(e.message)
        e.printStackTrace()
    }
}