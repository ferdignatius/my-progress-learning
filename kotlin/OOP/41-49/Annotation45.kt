package `41-50`

/**
 * Adalah menambahkan metadata ke program yang dibuat
 * Annotation biasanya digunakan untuk library / framework
 * Annotation bisa diakses menggunakan Reflection
 * Annotation hanya boleh memiliki properties via primary constructor
 */

/**
 * Attribute Annotation :
 * @Target => memeberitahu annotation bisa digunakan dimana
 * @Retention => memeberitahu annotation apakah disimpan di hasil compile / reflection
 * @Repeatable => memberitahu annotation apakah bisa digunakan lebih dari sekali di target sama
 * @MustBeDocumented => memberitahu annotation apakah perlu didokumentasikan di public API
 *
 */

// Membuat Annotation di kotlin
@Target(AnnotationTarget.CLASS) // hanya bisa di class
@Retention(AnnotationRetention.RUNTIME) // bisa dibaca di reflection
@MustBeDocumented
annotation class Annotation45 (val author: String)

// Menggunakan Annotation
@Annotation45(author = "Ferdi")
class MyApp(val type: String, val version: String){
    fun details(): String = "Aplication $type-$version"
}

fun main() {
    val myApp = MyApp("Android", "12")
    println(myApp.details())
}