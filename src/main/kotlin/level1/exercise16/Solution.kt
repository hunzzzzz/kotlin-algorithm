package level1.exercise16

class Solution {
    fun solution(x: Int, n: Int): LongArray {
        val numArray = LongArray(n)

        for (i in numArray.indices)
            numArray[i] = (x * (i + 1)).toLong()

        return numArray
    }
}