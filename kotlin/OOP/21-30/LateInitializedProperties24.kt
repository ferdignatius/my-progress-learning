package `21-30`

/**
 * Standartnya, di kotlin semua properties wajib diinisialisasi sejak deklarasi properties
 * Dengan kata kunci lateinit, kita bisa menundanya
 * lateinit hanya dapat digunakan di var
 * Biasanys lateinit ini dipake waktu menggunakan framework dari java
 */

class LateInitializedProperties24{
    lateinit var title: String

    fun initTitle(title: String){
        this.title = title
    }
}


class NormalProperties {
// Maksud inisialisasi itu ada nilainya
    var title: String = ""
}


fun main() {
    val initProperties = LateInitializedProperties24()
//    println(initProperties.title) => gak eror, tapi waktu di run pasti eror, karena valuenya gak ada
    initProperties.title = "Samsung"
    println(initProperties.title)


}