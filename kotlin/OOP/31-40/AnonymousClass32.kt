package `31-40`

import javax.swing.Action

/**
 * Anonymous class (class tanpa nama)
 * Anonymous class = membuat objek dari class yang belum lengkap (abstract class, Interface, dll)
 */

interface AnonymousClass32 {
    fun action(): Unit
}

fun fireAction(fire: AnonymousClass32){
    fire.action()
}

fun main() {
    // contoh annonymous class
    fireAction(object : AnonymousClass32 {
        override fun action() = println("Action 1")
    })

    fireAction(object : AnonymousClass32 {
        override fun action() = println("Action 2")
    })
}