fun main() {
    fun labelLoop(){
        LoopX@ for ( x in 1..10){
            LoopY@ for (y in 1..10){
                println("$x * $y = ${x * y}")
                if (y > 3){
                    break@LoopX // harusnya akan break loopY, tapi ini break LoopX
                }
            }
        }
    }

    labelLoop()

//    bisa dipakai untuk continue, break, return
//    tapi lebih baik jangan terlalu sering, karena bakal bikin bingung
}