package tipedata1

//    Constant => variable Immutable yg bs diakses untuk keperluan global (OOP)
//    Di deklarasikan di luar function
const val APP = "Belajar Kotlin Dasar"

fun main() {
//    Membuat variable wajib pakai tipedata

//    Immutable = variable tidak bisa diubah => val
    val firstName = "Ferdinand"
    val lastName = "Ignatius"

    //    Mutable = variable bisa diubah => var
    var tanggal: String = "Jumat, 8 April 2022"
    tanggal = "Sabtu, 9 April 2022"

//    Nullable = variable yang null
    var aksi: String? = "Mulai" // ? => memberi tahu variable ini boleh null
    aksi = null
    println(aksi?.length)

    println(APP)
}