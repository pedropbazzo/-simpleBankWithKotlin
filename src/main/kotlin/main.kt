fun main() {
    println("Bem vindo")

    /**
     * tanto var quanto val precisam ser inicializadas ou ter o tipo explicito
     */
    var t1 = "Pedro P Bazzo (var)";
    var t2: Short // tip: nao precisa ser inicializada
    val t3: String = "Inicializada obrigatoriamente ou deve ter um tipo explicito"

    val titular = "Pedro P Bazzo";
    var numeroDaConta: Int = 2020
    var saldo: Double = 0.0

    saldo = 200.0
    saldo += 0.2

    println("titular $titular [$t1]")
    println("numero da conta $numeroDaConta")
    println("saldo $saldo")

    /**
     * usando if-else padrao
     * https://kotlinlang.org/docs/reference/control-flow.html#if-expression
     */
    saldo = 0.0
    if (saldo > 0) {
        println("saldo positivo")
    } else if (saldo == 0.0) {
        println("saldo zerado!")
    } else {
        println("saldo negativo!")
    }
    /**
     * usando when (sugerido pela IDE)
     * https://www.baeldung.com/kotlin-when
     * https://kotlinlang.org/docs/reference/control-flow.html#when-expression
     */
    saldo = 0.1
    when {
        saldo > 0 -> {
            println("saldo positivo")
        }
        saldo == 0.0 -> {
            println("saldo zerado!")
        }
        else -> {
            println("saldo negativo!")
        }
    }
    /**
     * usando when (single-line)
     */
    saldo = -0.1
    when {
        saldo > 0 -> println("saldo positivo")
        saldo == 0.0 -> println("saldo zerado!")
        else -> println("saldo negativo!")
    }

    /**
     * usando IF como ternario
     */
    val t = if ((0..9).random() > 0) "maior que zero" else "eh zero"
    println(t)
}