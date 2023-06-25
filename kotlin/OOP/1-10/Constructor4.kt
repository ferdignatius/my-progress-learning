package `1-10`

/**
 * Constructor
 * Adalah function yg pertama kali dipanggil ketika objek dibuat
 * Mirip banget sama function
 * Tapi, ketika class menjadi constructor, maka saat dipanggil wajib tambahkan parameter
 */

class Constructor4 (
    firstnamePara: String,
    lastnamePara: String
        ) {
    var firstname: String = firstnamePara
    var lastname: String = lastnamePara
}


fun main() {
    val ferdi = Constructor4("Ferdinand", "Ignatius S")
    println(ferdi)
}