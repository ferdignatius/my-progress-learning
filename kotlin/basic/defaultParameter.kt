package function5

// di kotlin, nama function tidak boleh sama, meskipun berbeda file dan package

fun name(first: String, last: String = "") {
    println("Hello $first $last")
}



fun main() {
    name("Ferdinand", "Ignatius")
    name("Esii",)
    sayHi("Chelsea", null) // funct dari file lain
}