package aula11.ex4

fun main() {
    val funcionarios = ArrayList<Funcionario>()

    for (i in 0..3) {
        funcionarios.add(Funcionario("Funcionário ${i+1}", i+1))
    }

    val funcionario = Funcionario("Funcionário novo",2)

    println(funcionarios.contains(funcionario))
    //Inicialmente retornou false
    //Após sobrescrever retornou true
}