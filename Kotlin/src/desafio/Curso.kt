package desafio

class Curso(val nome: String,
            val codigo: Int,
            private val qtdMaxAlunos: Int) {

    lateinit var professorTitular: ProfessorTitular
    lateinit var professorAdjunto: ProfessorAdjunto
    private val alunos = ArrayList<Aluno>()

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if (alunos.contains(umAluno)) {
            throw Exception("Aluna já matriculado no curso")
        }

        if (alunos.size == qtdMaxAlunos) {
            return false
        }
        alunos.add(umAluno)
        return true
    }

    fun excluirAluno(umAluno: Aluno) {
        if(!alunos.contains(umAluno)) {
            throw Exception("Aluna não existe")
        }
        alunos.remove(umAluno)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Curso) return false

        if (codigo != other.codigo) return false

        return true
    }

    override fun hashCode(): Int {
        return codigo
    }
}