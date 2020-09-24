package aula12.ex4

fun main() {
    val guardaVolumes = GuardaVolumes()
    val pecas = mutableListOf<Peca>(Pertence("Lacost", "T-shirt"),
            Pertence("Nike", "Running Shoes")
    )

    val identificador = guardaVolumes.guardarPecas(pecas)
    println("Mostrando todas as peças do guarda-volumes")
    guardaVolumes.mostrarPecas()

    println("\nMostrando apenas as peças guardadas com o identificador retornado")
    guardaVolumes.mostrarPecas(identificador)

    guardaVolumes.devolverPecas(identificador)
    println("\nMostrando todas as peças guardadas com o identificador retornado")
    guardaVolumes.mostrarPecas(identificador)

}