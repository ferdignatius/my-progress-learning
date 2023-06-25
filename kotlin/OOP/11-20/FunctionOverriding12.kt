package `11-20`

/**
 * Function Overriding
 * Adalah kemampuan membuat ulang function yg ada di parent
 * Secara default, function itu final, jadi harus tambahkan @open sama seperti class
 */

// parent class
open class FunctionOverriding12 (val nama: String){
//    Function parent
    open fun sayHollaTo(nama: String) {
        println("Holla $nama, salam dari ${this.nama}")
    }
}

// child class
open class Ketua1(name: String) :FunctionOverriding12(name) {
//    Mendeklerasikan ulang function parent (overidding)
    /**
     * Tapi kalau mau bikin classnya open, tapi functionnya gak mau di override, bisa pakai kata final
     */
    final override fun sayHollaTo(nama: String) {
        println("Holla $nama, salam dari Ketua ${this.nama}")
    }
}

// child2
class Ketua2(name: String) :FunctionOverriding12(name) {
//    override fun sayHollaTo(nama: String) {
//        println("Holla $nama, salam dari Ketua ${this.nama}")
//    }
}



fun main() {
    val jomel = Ketua1("Jomel")
    println(jomel.sayHollaTo("Ferdi"))
}