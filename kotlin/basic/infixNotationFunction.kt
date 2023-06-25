package function5

// infix notation = operasi yang biasa dalam matematik, dimana melakukan operasi pada 2 data
// gampangnya infix notation function adalah function yang berfungsi sebagai operasi seperti halnya operasi dalam matematika

// Syarat
// harus sebagai function member / extension
// parameter harus 1, tidak boleh varargs, dan gak boleh ada nilai default

infix fun String.changeTo(type: String): String {
    if (type == "UP"){
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

fun main() {
    val nama: String = "Ferdinand" changeTo "UP"

//    contoh function infix lain
    val hasil = 100 downTo 1
}

