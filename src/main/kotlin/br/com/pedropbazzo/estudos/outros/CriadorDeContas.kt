package br.com.pedropbazzo.estudos.outros
import br.com.pedropbazzo.estudos.modelo.Conta as ContaDoModelo
import br.com.pedropbazzo.estudos.modelo.Conta as OutraConta

const val OUTRA_CONSTANTE_IMUTAVEL_MAS_GLOBAL = 0;

class CriadorDeContas {

    /**
     * Adicionamos membros static a classe através de companion objects
     *
     * https://kotlinlang.org/docs/reference/object-declarations.html#companion-objects
     */
    companion object Contador {

        /**
         * tip: constante em tempo de compilação. Ela poderia estar fora da classe tb
         *
         * https://kotlinlang.org/docs/reference/properties.html#compile-time-constants
         */
        const val CONTADOR_INICIAL = 0;

        var total = CONTADOR_INICIAL
            private set

        fun incrementa() {
            total++
        }
    }

    fun cria() {

        val c1 = Conta() // classe desse pacote
        val c2 = ContaDoModelo("", "", 1.1) // tip: podemo criar aliases para classes importadas
        val c3 = br.com.pedropbazzo.estudos.modelo.Conta("", "", 2.2)
        val c4 = OutraConta("", "", 3.3) // tip: alias pra mesma classe

        // acessando membros static da classe (apesar deles serem um companion object)
        total++
        incrementa()
    }
}