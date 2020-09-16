package aula7.ex2

class SessaoDeTreinamento (val experiencia: Int) {

    fun treinarA (jogador: JogadorDeFutebol) {
        println("Início do treinamento do jogador ${jogador.nome}")
        println()

        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        jogador.experiencia += experiencia

        println("Experiência inicial: ${jogador.experiencia - experiencia}")
        println("Experiência final: ${jogador.experiencia}")
        println()
        println("Fim do treinamento do jogador ${jogador.nome}")
        println()
    }
}