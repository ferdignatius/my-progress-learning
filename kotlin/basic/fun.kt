package function5

// parameter pasti dalam bentuk val, gak bisa diubah lagi

fun sayHi(nama: String, kelas: String?) {
    println("Hi $nama, dari kelas $kelas")
}

fun luasPersegi(x: Int, y: Int){
    println(x * y)
}

fun main() {
    sayHi("Ferdi", "XI IPA 3")
    sayHi("Esii", null)
    luasPersegi(6,3)
}