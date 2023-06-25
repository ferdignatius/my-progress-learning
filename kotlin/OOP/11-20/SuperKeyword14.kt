package `11-20`

/**
 * Super keyword adalah keyword untuk mengakses function/properties milik Parent Class melalui childnya
 */

open class SuperKeyword14 {
    open val nama = "Ferdi"
}

open class siswa1 : SuperKeyword14() {
    override val nama = "Esii"
    val parentNama = super.nama
}

/**
 * Super function
 * Adalah function khusus untuk melakukan super keyword
 */
class siswa2 : siswa1() {
    fun superFun(){
        println("Class siswa2 dengan Parent Class => ${super.nama}, dan class itu punya Parent Class => ${super.parentNama}")
    }
}

fun main() {
    println(siswa1().nama)
    println(siswa1().parentNama)

    println(siswa2().superFun())
}