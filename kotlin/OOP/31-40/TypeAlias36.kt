package `31-40`

/**
 * Type Alias = membuat nama berbeda dari tipe data yang telah ada
 * Biasanya untuk mempersingkat tipe data
 * Bisa digunakan untuk clas, interface, function
 */

// typealias class
typealias App = Aplikasi.Utilities
typealias Comp = CompanionObject35



// typealias function
typealias stringSulier = () -> String
fun sayHelloSuplier(suplier: () -> String){
    println("Hello ${suplier()}")
}


fun main() {
    println(App.toUpper("wasdafag"))
    println(Comp.toUpper("jomel"))

    sayHelloSuplier { "Ferdi" }
}

