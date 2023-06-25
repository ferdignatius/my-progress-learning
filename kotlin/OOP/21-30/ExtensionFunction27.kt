package `21-30`

/**
 * Adalah menambahkan function pada tipe data yang sudah ada
 * Extension function bukanlah function di class, tapi hanyalah function bantuan
 * jadi gak bisa akses private milik class
 */

class ExtensionFunction28 (val name: String, private val kelas: Int)
class ExtensionFunction (val name: String?, val kelas : Int?)

fun ExtensionFunction28.sayBye(){
//    println("Goodnye ${this.name} dari kelas $this.age") // eror
}

fun ExtensionFunction.sayBye(){
    println("Goodnye ${this.name} dari kelas ${this.kelas}")
}


// nullable externsion function
fun ExtensionFunction?.sayHi(name: String, kelas: Int){
    if (this != null){
        println("Hi ${this.name} dari kelas ${this.kelas}")
    } else {
        println("Hi $name dari kelas $kelas")
    }

}


fun main() {
    val e2 = ExtensionFunction("Ferdi", 11)
    val e3: ExtensionFunction? = ExtensionFunction(null,null)
    e2.sayBye()
    e3.sayHi("Esi", 10)
}