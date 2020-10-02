package aula7.ex3

fun main() {
    val atleta1 = Atleta("João", 10, 20)
    val atleta2 = Atleta("Carla", 5, 50)

    val provasAtleta1 = arrayOf(Prova(3, 10),
            Prova(7, 30),
            Prova(11, 10))

    val provasAtleta2 = arrayOf(Prova(5, 10),
            Prova(2, 50),
            Prova(11, 60))

    printPodeRealizarProva(provasAtleta1, atleta1)
    printPodeRealizarProva(provasAtleta2, atleta2)
}

fun printPodeRealizarProva(provas: Array<Prova>, atleta: Atleta) {
    println("Provas do(a) atleta ${atleta.nome}")
    provas.forEach { prova ->
        if (prova.podeRealizar(atleta)) {
            println("Pode realizar a prova")
        } else {
            println("Não pode realizar a prova")
        }
    }
    println()
}