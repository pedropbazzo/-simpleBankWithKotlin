import br.com.pedropbazzo.estudos.modelo.AnalistaDeSistema
import br.com.pedropbazzo.estudos.modelo.Desenvolvedor
import br.com.pedropbazzo.estudos.modelo.Gerente
import br.com.pedropbazzo.estudos.modelo.QA
import br.com.pedropbazzo.estudos.service.CalculadoraDeBonificacao
import org.junit.Assert
import org.junit.Test

class CalculadoraDeBonificacaoTest {

    @Test
    fun deveCalcularBonificacaoParaTodosOsFuncionarios() {

        val analista = AnalistaDeSistema(nome = "analista", cpf = "001", 1000.0)
        val gerente = Gerente(nome = "gerente", cpf = "002", 1000.0)
        val dev = Desenvolvedor(nome = "dev", cpf = "003", 1000.0)
        val qa = QA(nome = "qa", cpf = "004", 1000.0)

        val calculadora = CalculadoraDeBonificacao()

        calculadora.registra(qa)
        calculadora.registra(dev)
        calculadora.registra(gerente)
        calculadora.registra(analista)

        assertEqualsWithPrecision(850.00, calculadora.total)
    }

    private fun assertEqualsWithPrecision(expected: Double, actual: Double, delta: Double = 000.1) {
        Assert.assertEquals(expected, actual, delta)
    }

}