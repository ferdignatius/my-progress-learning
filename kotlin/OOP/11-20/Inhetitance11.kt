package `11-20`

/**
 * Inheritance (pewarisan)
 * Adalah kemampuan mewarisi isi class(parent) ke class lainnya(child)
 * Di kotlin, child hanya punya 1 parent, namun parent bisa punya banyak child
 * Standarnya, di kotlin default class adalah final(tak bisa diwariskan), tapi bisa diakali dengan 'open'
 * Kelebihannya adalah kode jadi lebih singkat
 */

// parent class
// gunakan @open untuk membuatnya menjadi bisa diwariskan
open class Inhetitance11 (val nama: String){
    fun sayHollaTo(nama: String) {
        println("Holla $nama, salam dari ${this.nama}")
    }
}

// child class
// @final keyword sebetulnya gak wajib, karna defaultnya final
// jika ada constructor, maka wajib ditambahkan didalamnya
final class Ketua() : Inhetitance11("Ferdi")
final class Wakil(namanya: String) : Inhetitance11(namanya)

fun main() {
    val ferdi = Ketua()
    println(ferdi.nama) // @nama disini adalah milik parent class

    val esi = Wakil("Esi")
    println(esi.sayHollaTo("Ferdi"))
}