package aula7.ex2

fun main() {
    val jogador1 = JogadorDeFutebol("Jogador 1",50)
    val jogador2 = JogadorDeFutebol("Jogador 2",60)

    val treinamento = SessaoDeTreinamento(5)
    treinamento.treinarA(jogador1)
    treinamento.treinarA(jogador2)

    println("Estado final de cada jogador")
    println("----------------------------")
    println(jogador1)
    println()
    println(jogador2)
}