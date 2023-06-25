package `21-30`

/**
 * Abstract class adalah class yang tidak bisa dibuat sebagai objek, dan hanya bisa diturunkan
 * Abstract class otomatis menjadi open, jadi tidak perlu tambahkan 'open'
 * Biasanya digunakan sebagai parent dari semua class, kek any
 */

abstract class AbstractClass21(val jenis: String)
class city(nama: String): AbstractClass21(nama)

fun main() {
   // val parent = AbstractClass21("Solo") // abstract class dibuat objek => eror
    val child = city("Solo")
}