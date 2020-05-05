package subtask5

import kotlin.reflect.KClass

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        val result = mutableListOf<String>()
        if (number.toInt() <= 0 || number.toCharArray().size > 10 || number.toCharArray().isEmpty()) {
            return null
        }
        for (char in number) {
            when (char) {
                '0' -> {
                    val n = 0
                    result.add(number.replace(
                        '0',
                        '8'
                    ))
                }
                '1' -> {
                    var n = 0
                    if (n == 0) {
                            result.add(number.replace(
                                '1',
                                '2'
                            ))
                    }
                    n += 1
                    if (n ==1) {
                        result.add(number.replace(
                            '1',
                            '4'
                        ))
                    }
                }
                '2' -> {
                    var n = 0
                    if (n ==0) {
                        result.add(number.replace(
                            '2',
                            '1'
                        ))
                    }
                    n +=1
                    if (n == 1) {
                        result.add(number.replace(
                            '2',
                            '3'
                        ))
                    }
                    n +=1
                    if (n == 2) {
                        result.add(number.replace(
                            '2',
                            '5'
                        ))
                    }
                }
                '3' -> {
                    var n = 0
                    if (n == 0) {
                        result.add(number.replace(
                            '3',
                            '2'
                        ))
                    }
                    n +=1
                    if (n == 1) {
                        result.add(number.replace(
                            '3',
                            '6'
                        ))
                    }
                }
                '4' -> {
                    var n = 0
                    if (n == 0) {
                        result.add(number.replace(
                            '4',
                            '1'
                        ))
                    }
                    n +=1
                    if (n == 1) {
                        result.add(number.replace(
                            '4',
                            '5'
                        ))
                    }
                    n +=1
                    if (n==2) {
                        result.add(number.replace(
                            '4',
                            '7'
                        ))
                    }
                }
                '5' -> {
                    var n = 0
                    if (n==0) {
                        result.add(number.replace(
                            '5',
                            '2'
                        ))
                    }
                    n +=1
                    if (n==1) {
                        result.add(number.replace(
                            '5',
                            '4'
                        ))
                    }
                    n +=1
                    if (n==2) {
                        result.add(number.replace(
                            '5',
                            '6'
                        ))
                    }
                    n+=1
                    if (n==3) {
                        result.add(number.replace(
                            '5',
                            '8'
                        ))
                    }

                }
                '6' -> {
                    var n = 0
                    if (n==0) {
                        result.add(number.replace(
                            '6',
                            '3'
                        ))
                    }
                    n+=1
                    if (n==1) {
                        result.add(number.replace(
                            '6',
                            '5'
                        ))
                    }
                    n+=1
                    if (n==2){
                        result.add(number.replace(
                            '6',
                            '9'
                        ))
                    }
                }
                '7' -> {
                    var n = 0
                    if (n==0) {
                        result.add(number.replace(
                            '7',
                            '4'
                        ))
                    }
                    n+=1
                    if (n==1) {
                        result.add(number.replace(
                            '7',
                            '8'
                        ))
                    }
                }
                '8' -> {
                    var n = 0
                    if (n==0) {
                        result.add(number.replace(
                            '8',
                            '5'
                        ))
                    }
                    n+=1
                    if (n==1){
                        result.add(number.replace(
                            '8',
                            '7'
                        ))
                    }
                    n+=1
                    if (n==2){
                        result.add(number.replace(
                            '8',
                            '9'
                        ))
                    }
                    n+=1
                    if (n==3){
                        result.add(number.replace(
                            '8',
                            '0'
                        ))
                    }
                }
                '9' -> {
                    var n = 0
                    if (n==0) {
                        result.add(number.replace(
                            '9',
                            '6'
                        ))
                    }
                    n+=1
                    if (n==1){
                        result.add(number.replace(
                            '9',
                            '8'
                        ))
                    }
                }
            }
        }
        return result.toTypedArray()
        throw NotImplementedError("Not implemented")
    }
}
