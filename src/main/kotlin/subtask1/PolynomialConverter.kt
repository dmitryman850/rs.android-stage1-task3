package subtask1

import kotlin.math.abs

class PolynomialConverter {

    // TODO: Complete the following function
    fun convertToStringFrom(numbers: Array<Int>): String? {
        val result = mutableListOf<String>()
        val exit = arrayOf<Int>()
        if (numbers.contentEquals(exit)) {
            return null
        }
        val reversedNum = numbers.reversedArray()
        println(reversedNum.toList())
        reversedNum.forEachIndexed { index, element ->
            when {
                element == 0 -> { }
                index == reversedNum.lastIndex -> {
                    result.add(element.toString() + "x^" + index.toString())
                }
                index == 0 -> {
                    result.add("+ $element")
                }
                index == 1 -> {
                    when {
                        element >= 2 -> {
                            result.add("+ " + element.toString() + "x")
                        }
                        element <= -2 -> {
                            result.add("- " + abs(element).toString() + "x")
                        }
                        element == 1 -> {
                            result.add("+ " + "x")
                        }
                        element == -1 -> {
                            result.add("- " + "x")
                        }
                    }
                }
                element >= 2 -> {
                    result.add("+ " + element.toString() + "x^" + index.toString())
                }
                element <= -2 -> {
                    result.add("- " + abs(element).toString() + "x^" + index.toString())
                }
                else -> {
                    result.add(element.toString() + "x")
                }
            }
        }
        result.reverse()
        return result.joinToString(prefix = "", postfix = "", separator = " " )

        throw NotImplementedError("Not implemented")
    }
}
