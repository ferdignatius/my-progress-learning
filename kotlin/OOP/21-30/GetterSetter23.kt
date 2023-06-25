package `21-30`

/**
 * Getter adalah function yang dibuat untuk mengambil data properties
 * Setter adalah function untuk mengubah data properties
 * Di Kotlin, itu semua dilakukan secara otomatis jadi tidak wajib
 * Tapi, kita bisa membuatnya seperti ini
 */

class Note (title: String){
    var title = title
    get() {
        println("Call Getter")
        return field // field = variable title
    }
    set(value) {
        println("Call Setter")
        if (value.isNotBlank()) {
            field = value
        }
    }

}

class BigNote(title: String) {
    var title = title
        get() {
            println("Call Getter")
            return field.toUpperCase()
        }
}


fun main() {
    val note1 = Note("Novel")
//    Getter
    println(note1.title)
//    Setter
    note1.title = "Komik"


    val bigNote = BigNote("Notebook")
    println(bigNote.title)
}