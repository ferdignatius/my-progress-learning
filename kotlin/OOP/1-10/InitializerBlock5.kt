package `1-10`

/**
 * Initializer block adalah blok kode yang akan dipanggil ketika constructor dipanggil
 * Caranya dengan tambahkan init
 * Note : block ini jgn sering dibuat, kalau buat boleh tapi jangan terlalu berat
 */

class InitializerBlock (
    firstnamePara: String,
    lastnamePara: String
) {
    var firstname: String = firstnamePara
    var lastname: String = lastnamePara

//    menambahkan initializer block
    init {
        println("Initializer block")
    }
}

fun main() {
    val jomel = InitializerBlock("Jomel", "Anjing")
    println(jomel.firstname)
}