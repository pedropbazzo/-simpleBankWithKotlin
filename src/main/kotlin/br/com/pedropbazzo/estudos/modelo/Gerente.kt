package br.com.pedropbazzo.estudos.modelo

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    private val senha: String = "123" // tip: atributo adicional; declaro e já seto; posso definir a visibilidade;
) : Funcionario(nome, cpf, salario) // tip: se classe filha tem construtor-primario entao deve chamar construtor-primario da classe pai
, Autenticavel { // tip: interfaces não possuem construtores (dica pra reconhecer!)

    override fun bonificacao(): Double { // tip: deve ter "override" para sobrescrever
        return this.salario * 0.3
    }

    /**
     * tip: override explicito mesmo para interfaces
     */
    override fun autentica(senha: String): Boolean {
        return senha == this.senha;
    }

}
