package `31-40`

/**
 * Singleton Object = objek yang hanya dibuat 1 kali
 * Cara membuatnya sama seperti membuat class, hanya ia mengunakan kata kunci objek
 * Singleton Object mirip dengan class hanya saja gak bisa constructor
 *
 * Singleton Object juga bisa dibuat sebagai inner class
 * namun, Singleton Object tidak bisa mengakses class outernya
 */

object SingletonObject34 {
    var title = "Utilities"
    fun printPage(page: Int): String{
        return "page $page = ${this.title}"
    }
}
/**
* Singleton Object juga bisa dibuat sebagai inner class
* namun, Singleton Object tidak bisa mengakses class outernya
*/

class Aplikasi (val merek: String){

    object Utilities {
        fun toUpper(section: String): String{
            return section.toUpperCase()
        }
    }
}


fun main() {
    println(SingletonObject34.printPage(1))
    SingletonObject34.title = "Settings"
    println(SingletonObject34.printPage(2))

    println(Aplikasi.Utilities.toUpper("awokwowkwokw"))
}