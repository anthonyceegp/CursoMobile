package aula11.ex5

fun main() {
    val listaStrings = ArrayList<String>()

    listaStrings.add("Pato")
    listaStrings.add("Cachorro")
    listaStrings.add("Gato")

    //print(listaStrings[3]) //IndexOutOfBounds

    try {
        print(listaStrings[3])
    } catch (e: Exception) {
        println(e.message)
        e.printStackTrace()
    }
}