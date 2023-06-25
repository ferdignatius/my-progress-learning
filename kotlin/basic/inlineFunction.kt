package function6

// Inline function adalah kemampuan kotlin High order function menjadi inline function atau function biasa
// perbedaannya terdapat di bytecodenya / hasil kompilenya
// inline function itu lebih cepet dari function biasa, ini terlihat kalau filenya besar

inline fun pak(name: () -> String): String {
    return "Pak ${name()}"
}

// kalau pake inline, semua isi function jg akan inline, buat ngatasi itu kalau gak mau
// pakai noinline
inline fun buk(
    firstname: () -> String,
    noinline lastname: () -> String): String {
    return "Pak ${firstname()} ${lastname()}"
}


fun main() {
    println(pak{"ferdi"})
    println(pak{"jomel"})


}