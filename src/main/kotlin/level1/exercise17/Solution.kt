package level1.exercise17

import kotlin.collections.ArrayList

class Solution {
    fun solution(n: Long): ArrayList<Int> {
        var numArray = n.toString().toCharArray()
        var result = arrayListOf<Int>()

        for (i in numArray.size - 1 downTo 0)
            result.add(Integer.parseInt(numArray[i].toString()))

        return result
    }
}