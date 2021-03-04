/**
 * https://kotlinlang.org/docs/reference/control-flow.html#for-loops
 */
fun main() {

    println("[+] loop FOR incrementando variavel")
    for (a in 1..5) {
        println("a=$a")
    }

    println("[+] loop FOR decrementando variavel")
    for (b in 5 downTo 1) {
        println("b=$b")
    }

    println("[+] loop FOR incrementando variavel com saltos")
    for (c in 0..10 step 2) {
        println("c=$c")
    }

    println("[+] loop FOR decrementando variavel com saltos")
    for (d in 10 downTo 0 step 2) {
        println("c=$d")
    }

    println("[+] loop WHILE basico")
    var i = 0
    while (i < 5) {
        println("i=$i")
        i++
    }

    println("[+] loop DO-WHILE basico")
    var j = 5
    do {
        println("j=$j")
        j--
    } while (j > 0)

    println("[+] loop FOR para coleções")
    val colecao = listOf("a", "b", "c")
    for (l in colecao) {
        print(l)
    }

    println("\n[+] loop FOR para range")
    val range = ('a'..'z')
    for (r in range) {
        print(r)
    }
}