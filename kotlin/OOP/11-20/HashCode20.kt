package `11-20`

/**
 * Hashcode adalah function yang digunakan sebagai representasi angka unik objek yang kita buat
 * Hashcode sangat berguna untuk mengkonversi objek menjadi angka
 */

class HashCode20 (name: String): EqualsFunciton19(name) {
//    override fun hashCode(): Int {
//        return name.hashCode()
//    }
}



fun main() {
    val equal1 = HashCode20("Jakarta")
    val equal2 = HashCode20("Jakarta")

    println(equal1.hashCode())
    println(equal2.hashCode())
    println(equal1 == equal2) // false
}