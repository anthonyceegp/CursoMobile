package desafio

class DigitalHouseManager {
    private val alunos = ArrayList<Aluno>()
    private val professores = ArrayList<Professor>()
    private val cursos = ArrayList<Curso>()
    private val matriculas = ArrayList<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {
        val curso = Curso(nome, codigoCurso, quantidadeMaximaDeAlunos)
        if (cursos.contains(curso)) {
            throw Exception("Curso já registrado")
        }

        cursos.add(curso)
    }

    fun excluirCurso(codigoCurso: Int) {
        val curso = cursos.firstOrNull { c -> c.codigo == codigoCurso }
                ?: throw Exception("O código do curso informado não existe")

        cursos.remove(curso)
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {
        val professorAdjunto = ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, quantidadeDeHoras)
        if (professores.contains(professorAdjunto)) {
            throw Exception("Professor já registrado")
        }

        professores.add(professorAdjunto)
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        val professorTitular = ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade)
        if (professores.contains(professorTitular)) {
            throw Exception("Professor já registrado")
        }

        professores.add(professorTitular)
    }

    fun excluirProfessor(codigoProfessor: Int) {
        val professor = professores.firstOrNull { p -> p.codigo == codigoProfessor }
                ?: throw Exception("O código do professor informado não existe")

        professores.remove(professor)
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        val aluno = Aluno(nome, sobrenome, codigoAluno)
        if (alunos.contains(aluno)) {
            throw Exception("Aluno já registrado")
        }

        alunos.add(Aluno(nome, sobrenome, codigoAluno))
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        val curso = cursos.firstOrNull { c -> c.codigo == codigoCurso }
                ?: throw Exception("O código do curso informado não existe")

        val aluno = alunos.firstOrNull { a -> a.codigo == codigoAluno }
                ?: throw Exception("O código do aluno informado não existe")

        if (!curso.adicionarUmAluno(aluno)) {
            println("Não foi possível realizar a matrícula. Não há mais vagas.")
        } else {
            val matricula = Matricula(aluno, curso)
            if(matriculas.contains(matricula)){
                throw Exception("Matrícula já registrada")
            }
            matriculas.add(Matricula(aluno, curso))
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        val curso = cursos.firstOrNull { c -> c.codigo == codigoCurso }
                ?: throw Exception("O código do curso informado não existe")

        val professorTritular = professores.firstOrNull { p ->
            p.codigo == codigoProfessorTitular &&  p is ProfessorTitular}
                ?: throw Exception("O código do professor titular informado não existe")

        val professorAdjunto = professores.firstOrNull { p ->
            p.codigo == codigoProfessorAdjunto && p is ProfessorAdjunto}
                ?: throw Exception("O código do professor adjunto informado não existe")

        curso.professorTitular = professorTritular as ProfessorTitular
        curso.professorAdjunto = professorAdjunto as ProfessorAdjunto
    }
}