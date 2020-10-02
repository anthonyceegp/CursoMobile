package aula10.ex1

class Aluno(nome: String, var sobrenome: String, registro: String) : Pessoa(nome, registro) {
    override val podeAssistirAula: Boolean
        get() = true

    override val podeFazerLicao: Boolean
        get() = true
}