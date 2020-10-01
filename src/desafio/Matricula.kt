package desafio

import java.time.LocalDateTime

class Matricula(val aluno: Aluno,
                val curso: Curso) {
    init {
        val dataMatricula: LocalDateTime = LocalDateTime.now()
    }
}