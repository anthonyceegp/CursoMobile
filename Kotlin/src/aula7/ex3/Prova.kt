package aula7.ex3

class Prova (val dificultade: Int, val energiaNecessaria: Int) {

    fun podeRealizar(atleta: Atleta): Boolean {
        return atleta.nivel >= dificultade && atleta.energia >= energiaNecessaria
    }
}