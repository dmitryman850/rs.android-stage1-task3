package subtask2

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        val m = array[0]
        val n = array[1]
        for(i in 0..n){
            if(m*factorial(i)*factorial(n-i)==factorial(n))
                return i
        }
        return null
        //throw NotImplementedError("Not implemented")
    }

    private fun factorial(num: Int): Int {
        if (num ==0 || num ==1) return 1
        var resultFac = 1
        for (i in 1..num){
            resultFac*=i
        }
        return resultFac
    }
}
