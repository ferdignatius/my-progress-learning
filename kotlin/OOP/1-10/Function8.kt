package `1-10`

/**
 * Di Class kita juga dapat membuat function seperti biasa
 */

class Function8 (
    var name: String,
    var kelas: String,
    val gender: String){

//    Pada function ini, kita bisa gunakan properties classnya sebagai datanya
    fun biodataSiswa() {
        println("Nama : $name,\n" +
                "Kelas : $kelas \n" +
                "Gender : $gender")
    }

    fun sayHello(){
        println("Hello $name")
    }
}


fun main() {
    val ferdi = Function8("Ferdinand", "XI", "Pria")
    val helloFerdi = ferdi.sayHello()
    val biodataFerdi = ferdi.biodataSiswa()
    println(helloFerdi)
    println(biodataFerdi)
}