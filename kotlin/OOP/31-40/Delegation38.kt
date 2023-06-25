package `31-40`

/**
 * Delegation = meneruskan properties / function ke objek yang lain
 * Di kotlin ada fitur yang otomatis
 * Meski sudah otomatis dibuatkan, kita tetap dapat mengoverridenya
 */

interface Base{
    fun callHello(name: String)
    fun tambah(x: Int, y: Int): Int
}

class MyBase : Base {
    override fun callHello(name: String) {
        println("Hello $name")
    }

    override fun tambah(x: Int, y: Int): Int {
        return x + y
    }
}

// Delegation Manual
class MyBaseDelegate(val base: Base): Base {
    override fun callHello(name: String) {
        base.callHello(name)
    }

    override fun tambah(x: Int, y: Int): Int {
        return base.tambah(x,y)
    }
}

// Delegation auto
class Delegation38( val bs: Base): Base by bs

fun main() {
    val base1 = MyBase()
    base1.callHello("Ferdi")

//  Delegation
    val baseDelegate = MyBaseDelegate(base1)
    baseDelegate.callHello("Esi")
    println(baseDelegate.tambah(1,2))

    val delegate = Delegation38(base1)
    println(delegate.tambah(1,5))
    delegate.callHello("Jomel")
}