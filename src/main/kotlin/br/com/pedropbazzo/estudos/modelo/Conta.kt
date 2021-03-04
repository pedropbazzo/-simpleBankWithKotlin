package br.com.pedropbazzo.estudos.modelo

/**
 * tip: Construtor primário
 * https://kotlinlang.org/docs/reference/classes.html#constructors
 */
class Conta(
    val titular: String, // tip: required e imutavel;
    val numero: String = "0000-0", // tip: optional e imutavel; tip: trailling-comma - ajuda em diffs do git
) {

    var saldo = 0.0
        private set // tip: configura setter como privado

    init {
        // tip: podemos executar código de inicialização aqui
    }

    /**
     * tip: Construtor secundário: deve referenciar o construtor primário se este existir
     * ou outro secundário
     */
    constructor(titular: String, numero: String, saldo: Double) : this(titular, numero) {
        this.saldo = saldo
    }

    /**
     * tip: composição de objetos
     */
    constructor(titular: Cliente, numero: String, saldo: Double) : this(
        titular = titular.nome,
        numero = numero
    ) {
        this.saldo = saldo
    }

    /**
     * Deposita na conta
     */
    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    /**
     * Saca da conta
     */
    fun saca(valor: Double): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false
    }

    /**
     * Transfere desta conta para conta de destino
     */
    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saca(valor)) {
            destino.deposita(valor)
            return true
        }
        return false
    }

}
