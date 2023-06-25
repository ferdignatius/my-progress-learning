package `1-10`

/**
 * Objek
 * Membuat objek sama seperti membuat function tapi pakai class
 * Dan manggilnya juga cukup seperti function
 */

fun main() {
    val ferdi = Class1()
//    memanipulasi firstname objek ferdi
    ferdi.firstname = "Ferdinand"

    val esi = Class1()
//    memanipulasi firstname objek esi
    esi.firstname = "Chelsea"


    println(ferdi)
    println(ferdi.firstname)
    println(esi)
    println(esi.firstname)

}