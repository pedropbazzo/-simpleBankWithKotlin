package br.com.pedropbazzo.estudos.modelo

class QA : Funcionario {

    val plr: Double

    /**
     * tip: usando construtor secundario em vez do primário
     */
    constructor(
        nome: String,
        cpf: String,
        salario: Double,
        plr: Double = 250.0
    ) : super(nome, cpf, salario) { // ...somos obrigados a invocar o construtor da classe mae
        this.plr = plr
    }

    override fun bonificacao(): Double {
        return (salario * 0.1) + this.plr;
    }

}
