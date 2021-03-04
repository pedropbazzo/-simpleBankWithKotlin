package br.com.pedropbazzo.estudos.service

import br.com.pedropbazzo.estudos.modelo.Funcionario

class CalculadoraDeBonificacao {

    var total = 0.0
        private  set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao()
    }

}