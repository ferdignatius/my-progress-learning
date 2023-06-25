package function5

// adalah kemampuan menambahkan function pada tipe data yang sudah ada
// pakai this untuk mengambil datanya

fun String.hello(): String = "Hello $this"

fun main() {
    val siswa: String = "ESI"
    println(siswa.hello())
}