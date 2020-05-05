package subtask6

class FullBinaryTrees {

    // TODO: Complete the following function
    fun stringForNodeCount(count: Int): String {
        if(count%2 ==0) {
            return "[]"
        } else if(count ==1) {
            return "[[0]]"
        }
        throw NotImplementedError("Not implemented")
    }
}
