package `21-30`

/**
 * Interface adalah blueprint, prototype, atau cetakan di kotlin (mirip class abstrak)
 * Bedanya dari class, Interface tidak bisa langsung dibuat dalam objek dan hanya bisa diturunkan
 * Standartnya, semua properties dan function dalam Interface itu abstrak
 * Kita tak bisa mendeklarasikan properties di Interface
 *
 * Beda dengan class, di Interface child bisa punya banyak porent Interface => multiple inheritance
 * Beda dengan class, Interface hanya bisa memiliki parent dari sesama Interface
 *
 * Jika kita memiliki function dengan nama sama di 2 Interface, maka akan terjadi konflik Interface
 */

interface Interface25 {
    val name: String

    /**
     * Concrete function
     * adalah fitur Interface yang membuat function tidak wajib di deklarasikan ulang di child
     */
    fun sayRun(): Unit {
        println("${this.name} say RUN!!")
    }
}

// inheritance antar Interface
interface Go: Interface25 {
    fun go(){
        println("GO!!")
    }
}

// konflik Interface
interface moveA {
    fun move(){
        println("Move A")
    }
}
interface moveB {
    fun move(){
        println("Move B")
    }
}


class printMove: moveA, moveB {
    // solusi konflik Interface
    override fun move(){
        super<moveA>.move()
        super<moveB>.move()
    }
}

class people1(override val name : String): Interface25{
    override fun sayRun() {
        println("people2, ${this.name} say RUN!!")
    }
}

// multiple inheritance
class people2(override val name : String): Interface25, Go {
}



fun main() {
    val p1 = people1("Jomel")
    p1.sayRun()
    val p2 = people2("Esi")
    p2.sayRun()
    p2.go()

    val moveAct = printMove()
    moveAct.move()
}