package `31-40`

/**
 * Kotlin juga mendukung delegation di properties
 * Salah satu implementasi dari delegation properties adalah lazy properties
 * Lazy adalah standar library agar properties baru dianalisis ketika properties itu diakses
 * Kalau lazy, jika tidak dipanggil tidak akan dieksekusi, baru dieksekusi jika dipanggil
 */

class LazyProperties39 {
//    Lazy properties
    val name: String by lazy {
        println("Call lazy")
        "Ferdi"// value properties
    }
}


fun main() {
    val callLazy = LazyProperties39()
    println(callLazy.name)
}