package exercise28

class Solution {
    fun solution(numbers: IntArray): Int {
        val numMap = mutableMapOf<Int, Boolean>()
        for (num in numbers) {
            if (!numMap.containsKey(num))
                numMap[num] = true
        }

        var sum = 0
        for (i in 0..9) {
            if (!numMap.containsKey(i))
                sum += i
        }
        return sum
    }
}