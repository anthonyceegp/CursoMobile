package aula10.ex1

class Curso(var nome: String, var professorResponsavel: Professor) {
    val aulas get() = ArrayList<Aula>()
    val alunos get() = ArrayList<Aluno>()
}