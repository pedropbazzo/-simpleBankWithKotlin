import br.com.pedropbazzo.estudos.modelo.Desenvolvedor
import br.com.pedropbazzo.estudos.modelo.Gerente
import br.com.pedropbazzo.estudos.modelo.QA
import org.junit.Assert
import org.junit.Test

class FuncionarioTest {

    @Test
    fun deveCalcularBonificacaoQuandoDesenvolvedor() {
        // cenário
        val dev = Desenvolvedor(
            nome = "pedro",
            cpf = "000.000.000-00",
            salario = 1042.91
        )

        // ação
        val bonificacao = dev.bonificacao()

        // validação
        assertEqualsWithPrecision(104.29, bonificacao)
    }

    @Test
    fun deveCalcularBonificacaoQuandoQA() {
        // cenário
        val qa = QA(
            nome = "pedro",
            cpf = "000.000.000-00",
            salario = 1042.91,
        )

        // ação
        val bonificacao = qa.bonificacao()

        // validação
        assertEqualsWithPrecision(354.29, bonificacao)
    }

    @Test
    fun deveCalcularBonificacaoQuandoGerente() {
        // cenário
        val gerente = Gerente(
            nome = "pedro",
            cpf = "000.000.000-00",
            salario = 1042.91,
            senha = "22" // opcional
        )

        // ação
        val bonificacao = gerente.bonificacao()

        // validação
        assertEqualsWithPrecision(312.87, bonificacao)
    }

    private fun assertEqualsWithPrecision(expected: Double, actual: Double, delta: Double = 000.1) {
        Assert.assertEquals(expected, actual, delta)
    }
}