package `11-20`

/**
 * toString() => adalah function yang digunakan untuk memberitahu representasi String dari objek
 * Saat melakukan print(), sebenarnya kita memanggil toString()
 * Standardnya, toString() mengembalikan kode
 */

class toStringFunction18(var name: String){
    // Coment kode dibawah dan run untuk melihat perbedaannya
//    override fun toString(): String {
//        return "Nama = $name"
//    }
}

fun main() {
    println(toStringFunction18("Ferdi"))
    println(toStringFunction18("Esii"))
    println(toStringFunction18("Jomel"))
}