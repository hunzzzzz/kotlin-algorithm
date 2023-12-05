package exercise16

class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var inputNum: Long = 0
        val numList = LongArray(n)

        for (i in numList.indices) {
            inputNum += x
            numList[i] = inputNum
        }

        return numList
    }
}