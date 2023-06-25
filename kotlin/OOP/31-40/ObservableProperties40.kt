package `31-40`

import kotlin.properties.Delegates

/**
 * Observable properties adalah standar library kotlin
 * Dengan observable properties, kita bisa tahu value sebelum dan sesudah properties diubah
 */

class ObservableProperties40 (jenis: String){
    var jenis: String by Delegates.observable(jenis){
        property, oldValue, newValue ->
            println("$property change from $oldValue to $newValue")
    }
}

fun main() {
    val obs = ObservableProperties40("Anjing")
    obs.jenis = "Kucing"
    obs.jenis = "Hamster"
    obs.jenis = "Hamster"
}