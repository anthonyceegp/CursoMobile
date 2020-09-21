package aula11.ex3

fun main() {
    val alunos = ArrayList<Aluno>()

    for (i in 0..3) {
        alunos.add(Aluno("Aluno ${i+1}", i+1))
    }

    val aluno = Aluno("Aluno novo",2)

    println(alunos.contains(aluno))
    //Inicialmente retornou false
    //Após sobrescrever retornou true
}