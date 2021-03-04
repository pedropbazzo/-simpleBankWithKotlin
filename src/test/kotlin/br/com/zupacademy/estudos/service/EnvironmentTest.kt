package br.com.pedropbazzo.estudos.service

import br.com.pedropbazzo.estudos.service.env.Environment
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class EnvironmentTest {

    @Before
    fun init() {
        System.setProperty("myProp", "@rponte")
    }

    @After
    fun cleanUp() {
        System.clearProperty("myProp")
    }

    @Test
    fun deveRetornarVersaoDaApp() {
        assertEquals("1.20.20-beta", Environment.version)
    }

    @Test
    fun deveEncontrarPropertyDaJvm() {

        // ação
        val value = Environment.getProperty("myProp")

        // validação
        assertEquals(value, "@rponte")
    }

    @Test
    fun deveRetornarValorPadraoQuandoNaoEncontrarPropertyDaJvm() {

        // ação
        val value = Environment.getProperty(
            name = "invalidProp",
            defaultValue = "xilito"
        )

        // validação
        assertEquals(value, "xilito")
    }

    @Test
    fun deveRetornarInformacoesDoSistemaOperacional() {

        // ação
        val osInfo = Environment.getOSInfo()

        // validação
        assertEquals(osInfo.name, "Windows")
        assertEquals(osInfo.version, "10")
    }

}