package `21-30`

/**
 * Sealed class adalah jenis class yang di desain untuk inheritance
 * Tidak bisa dijadikan objek, dan standartnya adalah abstrak classs
 * Cocok digunakan sebagai parent class
 */

sealed class SealedClass30(val nama: String)

class plus: SealedClass30("Plus")
class minus: SealedClass30("Minus")

/**
 * Sealed class sangat berguna jika digabungkan dengan when expression
 * Jadi kita bisa membatasi hanya class turunannya saja yang perlu di cek
 */

fun operasi(x: Int, y: Int, kelas: SealedClass30): Int {
    return when (kelas){
        is plus -> x + y
        is minus -> x - y
    }
}


fun main() {
    println(operasi(1,2,plus()))
    println(operasi(1,2,minus()))
}