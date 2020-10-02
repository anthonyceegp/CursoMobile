package desafio

class ProfessorTitular(nome: String,
                       sobrenome: String,
                       tempoCasa: Int,
                       codigo: Int,
                       val especialidade: String) : Professor(nome, sobrenome, tempoCasa, codigo) {
}