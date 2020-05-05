package subtask3

class ArrayCalculator {

    // TODO: Complete the following function
    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {
        val list: MutableList<Int> = mutableListOf()
        val list2: MutableList<Int> = mutableListOf()
        var resultA: Int = 1
        var a: Int
        var b = numberOfItems
        for (i in itemsFromArray) {
            if (i is Int) {
                    list.add(i)
            }
        }
        if (list.size == 0)
            return 0
        println(list)
        list.sortDescending()
        println(list)
        when {
            b >= list.size - 1 -> {
                for (i in list) {
                    resultA *= i
                }
                println(resultA)
                return resultA
            }
            list[0]*list[1] < list[list.size-1]*list[list.size-2] -> {
                for (i in list) {
                    if (i < 0) {
                        a = i * -1
                        list2.add(a)
                    } else list2.add(i)
                }
                for ( i in list2.sortedDescending()) {
                    if (b > 0) {
                        resultA *=i
                        println(resultA)
                        b -=1
                    }
                }
            }
            else -> for (i in list) {
                if (b > 0) {
                    resultA *= i
                    println(resultA)
                    b -= 1
                }
            }
        }
        return resultA
        throw NotImplementedError("Not implemented")
    }
}
