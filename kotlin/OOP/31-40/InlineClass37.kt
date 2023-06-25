package `31-40`

/**
 * Jika terlalu banyak membuat class, maka memori akan semakin terbebani
 * Kotlin bisa membuat class menjadi inline dengan kata kunci inline
 * Syaratnya hanya boleh 1 properties
 *
 * Meskipun terlihat sama saja, namun saat di compile, inline class hanya dibaca string biasa
 */

inline class InlineClass37 (val proper: String){
    fun callProper(){
        println(this.proper)
    }
}


fun main() {
    InlineClass37("XD").callProper()
}