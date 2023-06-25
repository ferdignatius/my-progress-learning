package tipedata1

fun main(){
// Number integer
    var age: Byte = 30 // Byte (-128 sampai 127)
    var height: Int = 180
    var jarak: Short = 2000 // Short (-32768 smpai 32767)
    var balance: Long = 1141515156L

    println(age)
    println(height)
    println(jarak)
    println(balance)
    println("=========")

// Number float
    var tinggi: Float = 10.5F
    var hasilKoma: Double = 104.51

    println(tinggi)
    println(hasilKoma)
    println("=========")

// Underscore => cuma buat penanda aja, biar gak pusing bacanya
    var angka: Long = 9_000_000_000L
    println(angka)

// Conversion => mengubah tipe data menjadi ..
    var angkaToInt: Int = angka.toInt() // kena overflow (int maksnya cuma sampe 2m)
    var angkaToByte: Byte = angka.toByte()

    println(angkaToInt)
    println(angkaToByte)




}