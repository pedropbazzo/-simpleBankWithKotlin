package br.com.pedropbazzo.estudos.modelo

/**
 * tip: deve ser "open" para ser herdada
 * tip: classes abstrata já são open por padrão
 */
abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
) {

    /**
     * tip: deve ser "open" para sobrescrita
     * tip: ou `fun bonificacao() = this.salario * 0.1`
     * tip: ou tratar como uma property que possui get() apenas
     */
    abstract fun bonificacao(): Double

}