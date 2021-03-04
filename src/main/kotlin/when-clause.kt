/**
 * https://kotlinlang.org/docs/reference/control-flow.html#when-expression
 */
fun main() {

    /**
     * How to generate a random number in Kotlin
     * https://stackoverflow.com/questions/45685026/how-can-i-get-a-random-number-in-kotlin
     */

    println("[+] usando WHEN como statement para substituir if-else-if")
    val z = "@gmail.com"
    when {
        z.endsWith("gmail.com") -> {
            println("email pessoal")
        }
        z.equals("@bank.com.br") -> {
            println("email do banco")
        }
        else -> {
            println("email desconhecido")
        }
    }

    println("[+] usando WHEN como statement")
    var r = (1..100).random()
    println("numero=$r")
    when (r) {
        100 -> println("numero 100, uuhuul!!")
        7, 13 -> { // tip: OR
            println("numero cabalistico")
        }
        in 60..99 -> println("entre 60 e 99")
        else -> {
            println("pois eh ne, nao foi dessa vez!")
        }
    }

    println("[+] usando WHEN como expression")
    var t = (0 until 10).random() // numero 10 nao incluido
    val e = when {
        (t == 0) -> {
            println("zero nao eh par nem impar")
            "zero"
        }
        (t % 2 == 0) -> {
            println("par")
            "par"
        }
        else -> {
            println("impar")
            "impar"
        }
    }

    println("[+] usando WHEN para checar tipos (smart casts)")
    fun isString(s : Any) = when(s) {
        is String -> true
        else -> false
    }

    val s1 = isString("39");
    val s2 = isString(39);
    println("s1=$s1 / s2=$s2")
}