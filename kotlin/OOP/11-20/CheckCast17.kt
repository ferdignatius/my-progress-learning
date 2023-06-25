package `11-20`

/**
 * Check => pengecekan tipe data
 * Cast => konversi data
 */


/**
 * Check
 * is => pengecekan apakah data milik tipe data tertentu
 * !is => pengecekan apakah data bukan milik tipe data tertentu
 */

/**
 * Cast
 * Kotlin dapat konversi data otomatis setelah melakukan is
 * Adanya $any.jenis is bukti konversi otomatis kotlin
 */

fun cekTipe(any: Any){
    if (any is Laptop) {
        println("${any.jenis} is Laptop")
    } else if (any is Smartphone){
        println("${any.jenis} is Smartphone")
    } else {
        println(any)
    }
}

fun cekTipe2 (any: Any){
    when (any){
        is Laptop -> println("${any.jenis} is Laptop")
        is Smartphone -> println("${any.jenis} is Smartphone")
        else -> println(any)
    }
}

// Unsafe cast => adalah menkonversi data secara paksa
// Meskipun bisa, tapi jika anynya tipe datanya bukan string, maka eror
// Namun bisa diakali dengan 'as?', jadi jika gagal @value akan null
fun printString(any: Any){
    val value = any as? String
    println(value)
}


fun main() {
    val samsung = Smartphone("Samsung")
    val mac = Laptop("Mac Book")
    cekTipe(samsung)
    cekTipe(mac)
    cekTipe(1)

    cekTipe2(Smartphone("Nokia"))
    cekTipe2(Laptop("Acer"))
    cekTipe2(1)

    printString("Ferdi")
    printString(1)
    printString('A')
}