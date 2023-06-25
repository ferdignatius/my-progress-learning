package `1-10`

/**
 * Secondary constructor
 * Adalah constructor di dalam constructor
 * Secondary constructor bisa dibuat berkali kali
 */

class SecondaryConstructor6 (firtstname: String, lastname: String, umur: Int){
    init {
        println("Firstconstructor")
    }
//    Menambahkan secondary constructor
    constructor(firtstname: String) : this(firtstname = "", lastname = "", umur = 0){
        println("SecondaryConstructor firstname")
    }
    constructor(umur: Int) : this(firtstname = "", lastname = "", umur = 0){
        println("SecondaryConstructor umur")
    }

}
fun main() {
//    memanggil primary constructor
    val esi = SecondaryConstructor6("Chelsea", "Laviola", 17)
    println("======================")

//    memanggil secondary constructor
    val jomel = SecondaryConstructor6("Jomel")
    println("======================")

    val ferdi = SecondaryConstructor6(17)
}