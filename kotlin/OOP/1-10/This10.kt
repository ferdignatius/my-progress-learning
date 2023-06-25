package `1-10`

/**
 * This keyword
 * Adalah keyword yg digunakan untuk mereferensikan objek ini
 * This hanya bisa diakses di class/objek itu sendiri
 * Biasanya digunakan untuk mengakses properties dengan nama yg sama
 */

class This10 (val nama: String){
    fun sayHollaTo(nama: String) {
        println("Holla $nama, salam dari ${this.nama}")
    }
}

fun main() {
    val ferdi = This10("Ferdi")
    println(ferdi.sayHollaTo("Esii"))
}