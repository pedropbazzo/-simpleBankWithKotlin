package br.com.pedropbazzo.estudos.service.env

/**
 * tip: é um Singleton
 *
 * Object Declarations
 * https://kotlinlang.org/docs/reference/object-declarations.html#object-declarations
 */
object Environment {

    var version: String = "1.20.20-beta"
        private set // poderia usar val, mas fiz apenas para testes

    fun getProperty(name: String): String? { // tip: o "?" indica que o metodo pode retornar NULL
        return System.getProperty(name)
    }

    fun getProperty(name: String, defaultValue: String): String {
        val value = getProperty(name) // tip: kotlin esperto! ele sabe que pode retornar NULL
        if (value != null) {
            return value
        }
        return defaultValue
    }

    fun getOSInfo(): OSInfo {
        /**
         * Object Expression
         * https://kotlinlang.org/docs/reference/object-declarations.html#object-expressions
         *
         * tip: funciona similar a uma anonymous class em java
         */
        val info = object : OSInfo {
            override val name = "Windows"
            override val version = "10"
        }
        return info
    }

}