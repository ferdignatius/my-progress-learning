package `1-10`

/**
 * Function overloading => kemampuan membuat function yg namanya sama dalam class
 * Syaratnya :  parameternya harus beda (jumlah/tipe data)
 */

class FunctionOverloading9 (   var name: String,
                               var kelas: String,
                               val gender: String) {

    fun sayHello(firstname: String) {
        println("Hello $firstname")
    }

    fun sayHello() {
        println("Hello $name")
    }

    fun sayHello(clas: Int){
        println("Hallo anak kelas $clas")
    }
}

fun main() {
    val esii = FunctionOverloading9("Esi", "XI", "Wanita")
    println(esii.sayHello())
    println(esii.sayHello("Chelsea"))
    println(esii.sayHello(11))
}