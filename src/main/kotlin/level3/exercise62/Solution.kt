package level3.exercise62

import java.lang.StringBuilder

class Solution {
    fun solution(babbling: Array<String>): Int {
        val words = arrayListOf("aya", "ye", "woo", "ma")
        val temp = StringBuilder()
        val tempArray = arrayListOf<String>()
        var count = 0

        for (i in babbling.indices) {
            for (ch in babbling[i]) {
                temp.append(ch)
                if (words.contains(temp.toString())) {
                    if (tempArray.isEmpty() || tempArray[tempArray.lastIndex] != temp.toString())
                        tempArray.add(temp.toString())
                    temp.clear()
                }
            }
            if (tempArray.joinToString("") == babbling[i]) count++

            temp.clear()
            tempArray.clear()
        }
        return count
    }
}