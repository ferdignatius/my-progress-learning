package function5

// di kotlin kalau kita buat function, itu bisa diakses lewat file manapun
// tapi kita bisa membuat function yang hanya diakses oleh main functionnya saja
// inilah function scope dalam kotlin

fun main() {
    sum(5,10) // function dari file returnFunction

    fun asalSekolah(nama: String, sekolah: String): String {
        return "$nama asalnya dari sekolah $sekolah"
    } // function ini gak bisa diakses diluar file ini

    println(asalSekolah("Andika", "Setia Bakti"))

}