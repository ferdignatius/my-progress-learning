package `31-40`

/**
 * Enum class = representasi data yang sudah tetap nilainya (jenis kelamin, arah)
 * Enum class tak bisa dibuat objek, tapi bisa deklarasikan langsung data di classnya
 * Enum class juga punya properties, functionc, constructor
 */

enum class Gender (val deskripsi: String) {
    MALE("Cowok"),
    FEMALE("Cewek");

    fun showDeskripsi(): Unit {
        println(deskripsi)
    }
}

enum class Arah {
    EAST, SOUTH, WEST, NORTH
}

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val allGender = Gender.values()

    val jakarta = Arah.EAST
    val lampung = Arah.WEST
    val allArah = Arah.values()

//    konversi string ke data enum. Syaratnya valuenya harus sama dengan data enumnya
    val manFromString = Gender.valueOf("MALE")
    val womanFromString = Gender.valueOf("FEMALE")

    println(man)
    println(woman)
    man.showDeskripsi()
    woman.showDeskripsi()

}