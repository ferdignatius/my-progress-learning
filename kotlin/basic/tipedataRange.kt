package tipedata1

fun main() {
//    range sama seperti array, buat mempermudah dalam memasukkan angka yang banyak
//    biasanya dipakai di perulangan
    val angka = 0..100
    val angka2 = 0..100 step 2
    println(angka)
    println(angka2)


//    operasi range
    println(angka.count()) // menghitung banyaknya angka
    println(angka.contains(50)) // mengecek apakah value ada di range
    println(angka.first) // mengecek angka pertama
    println(angka.last) // mengecek angka terakhir
    println(angka.step) //mengecek kenaikan
    println(angka2.step) //mengecek kenaikan


//    range terbalik
    val reverseAngka = 100 downTo 0
}