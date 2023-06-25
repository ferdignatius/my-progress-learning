package `31-40`

/**
 * Companion Object = kemampuan membuat inner objek dalam class tanpa harus menggunakan object
 * (mirip singleton object)
 * Cocok untuk membuat singleton objek yg namanya sama dengan nama classnya
 */

class CompanionObject35 (val merek: String){

    companion object {
        fun toUpper(section: String): String{
            return section.toUpperCase()
        }
    }
}

fun main() {
    CompanionObject35.toUpper("cuacabcia")
    CompanionObject35.Companion.toUpper("cuacabcia")
}