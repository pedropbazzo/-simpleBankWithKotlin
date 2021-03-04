package br.com.pedropbazzo.estudos.modelo

class AnalistaDeSistema(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {


    override fun bonificacao(): Double {
        return this.salario * 0.1
    }

}