package desafio

fun main() {
    val digital = DigitalHouseManager()

    digital.registrarProfessorTitular("Professor","1", 1, "Dr")
    digital.registrarProfessorAdjunto("Professor", "2", 2, 2)

    digital.registrarCurso("Cálculo 1",1,2)
    digital.registrarCurso("Cálculo 2",2,2)

    digital.matricularAluno("Aluno","1",1)
    digital.matricularAluno("Aluno","2",2)
    digital.matricularAluno("Aluno","3",3)

    digital.matricularAluno(1,1)
    digital.matricularAluno(2,1)

    digital.matricularAluno(1,2)
    digital.matricularAluno(2,2)

    digital.alocarProfessores(1,1,2)
    digital.alocarProfessores(2,1,2)

    digital.excluirCurso(1)
    digital.excluirCurso(2)

    digital.excluirProfessor(1)
    digital.excluirProfessor(2)

    val curso = Curso("Cálculo 3",3,3)
    val aluno = Aluno("Aluno","3",3)

    curso.adicionarUmAluno(aluno)
    curso.excluirAluno(aluno)
}