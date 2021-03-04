import br.com.pedropbazzo.estudos.modelo.Cliente
import br.com.pedropbazzo.estudos.modelo.Conta
import org.junit.Test
import kotlin.test.assertEquals

class ContaTest {

    @Test
    fun deveSacarDaConta() {
        // cenario
        val conta = Conta(titular = Cliente("pedropbazzo", "111.111.111-11")
                        , numero  = "2020-0"
                        , saldo   = 100.0) // tip: named parameters em construtores

        // ação
        conta.saca(valor = 20.99) // tip: named parameters em metodos

        // validação
        assertEquals(79.01, conta.saldo, "saldo")
    }

    @Test
    fun deveDepositarNaConta() {
        // cenario
        val conta = Conta("pedropbazzo", "2020-0", 100.0)

        // ação
        conta.deposita(20.99)

        // validação
        assertEquals(120.99, conta.saldo, "saldo")
    }

    @Test
    fun naoDeveDepositarNaContaValorNegativo() {
        // cenario
        val conta = Conta("pedropbazzo", "2020-0", 100.0)

        // ação
        conta.deposita(-0.01)

        // validação
        assertEquals(100.0, conta.saldo, "saldo")
    }

    @Test
    fun naoDeveDepositarNaoContaValorZero() {
        // cenario
        val conta = Conta("pedropbazzo", "2020-0", 100.0)

        // ação
        conta.deposita(0.0)

        // validação
        assertEquals(100.0, conta.saldo, "saldo")
    }

    @Test
    fun `deve transferir dinheiro entre contas`() {
        // cenário
        val origem = Conta("origem", "2020-0", 100.0)
        val destino = Conta("destino", "2020-0", 45.50)

        // ação
        // https://kotlinlang.org/docs/reference/functions.html#named-arguments
        origem.transfere(50.25, destino = destino) // tip: named parameter: depois do primeiro argumento os demais devem ser named

        // validação
        assertEquals(49.75, origem.saldo, "saldo da origem")
        assertEquals(95.75, destino.saldo, "saldo do destino")
    }
}