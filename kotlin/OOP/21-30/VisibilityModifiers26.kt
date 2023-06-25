package `21-30`

/**
 * Ada 4 visibility modifier di kotlin = public, provate, protected, internal
 * Standartnya itu public
 * 1. Public => dapat diakses dari manapun
 * 2. Privare => hanya bisa diakses di tempat deklarasinya
 * 3. Protected => hanya bisa diaksess di tempat deklarasi dan turunannya
 * 4. Internal => hanya bisa diakses di modul / project yang sama
 */

class VisibilityModifiers26 {
//    function dibawah hanya bisa diakses di class VisibilityModifiers26
    private var name: String = ""
//    function dibawah hanya bisa diakses di class VisibilityModifiers26
    private fun teach(){
        println("Teach ${this.name}")
    }

//    solusinya adalah pakai getter dan setter
    fun getTeach() = teach()
    fun getName() = this.name



    fun setName(name: String) {
        this.name = name
    }


}


fun main() {
    val v1 = VisibilityModifiers26()
//    v1.name = "Jomel" // error
    v1.setName("Jomel")
//    println(v1.name) // error
    println(v1.getName())
//   v1.teach() // error
    v1.getTeach()
}

