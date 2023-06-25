package `21-30`

/**
 * Data class adalah class yang digunakan sebagai representasi dari data
 * Data class secara otomatis membuatkan equals, hashcode, toString, dan
 * copy semua properties dari primary constructor yg dimiliki data class
 */

data class DataClass29(val nama: String, val umur: Int, val jurusan: String )


fun main() {
    val ferdi = DataClass29("Ferdinand", 17, "IPA")
    println(ferdi)

    /**
     * Copy data class
     * Data class memiliki function copy yang digunakan untuk mencopy objek sekaligus mengubah propertiesnya
     */
    val esi = ferdi.copy(nama = "Chelsea", jurusan = "PBK" )
    println(esi)

    val andika = ferdi.copy(nama = "Andika")
    println(andika)

}

