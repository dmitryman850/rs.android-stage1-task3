package subtask4

import kotlin.math.sqrt

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
        val result: MutableList<Int> = mutableListOf<Int>()
        if (number <= 2 ) {
            return null
        } else
            result.add(number-1)
        println("1: $result")
        var resProm = (number*number)-(number-1)*(number-1)
        println("2: $resProm")
        while (resProm >= 4) {
            result.add(sqrt(resProm.toDouble()).toInt())
            println("3: $result")
            resProm = ostatock(resProm)
            println("4: $resProm")
        }
        if (resProm == 1) {
            result.add(1)
        }
        for (i in result) {
            for (b in 1 until result.size)
            if (b == i) {
                result[i] = i-1
                println("5: $result")
            }
        }
        if (resProm == 0) {
            val b = result.reversed()
            return b.toTypedArray()
        }





        var summa: Int = 0
        for(i in result){
            summa += (i * i)
            println(summa)
        }
        throw NotImplementedError("Not implemented")
    }
    private fun ostatock (resProm: Int): Int {
        return resProm - (sqrt(resProm.toDouble()).toInt()) * sqrt(resProm.toDouble()).toInt()
    }

}
