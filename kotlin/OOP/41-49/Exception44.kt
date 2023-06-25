package `41-50`

/**
 * Error di kotlin direpresentasikan dengan Exception, tipe data error adalah turunan Throwable
 * Kita bisa menggunakan kata kunci throw untuk membuat error
 * Saat terjadi exception, maka program berhenti
 * Di kotlin dapat melakukan sesuatu jika terjadi error, itu disebut Try Catch
 * Kita juga bisa melakukan multiple Catch
 */

class Exception44(message: String): Throwable(message)

fun validateAndSayHello(name: String){
    if (name.isBlank()){
        throw Exception44("name is blank")
    } else {
        println("Hello $name")
    }
}

fun main() {
    try {
        validateAndSayHello("Esi")
        validateAndSayHello("")
        println("Program")
    }
//    Multiple catch
    catch (error: Exception44){
        println("ERROR with message : ${error.message}")
    }catch (error: Throwable){
        println("ERROR with message : ${error.message}")
    }
//    Finaly => blok finnaly akan di eksekusi jika kode try catch error maupun sukses
    finally {
        println("Program end")
    }

}