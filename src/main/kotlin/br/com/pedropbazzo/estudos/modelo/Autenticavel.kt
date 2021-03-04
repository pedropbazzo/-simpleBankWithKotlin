package br.com.pedropbazzo.estudos.modelo

interface Autenticavel {

    fun autentica(senha: String): Boolean;

    /**
     * tip: método com implementação
     */
    fun mudaSenha(senhaAntiga: String, senhaNova: String) {
        println("Mudando senha antiga para nova")
    }

}