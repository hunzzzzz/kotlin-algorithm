package level1.exercise12

class Solution {
    fun solution(arr: IntArray): Double {
        var sum = 0.0

        for (num in arr)
            sum += num

        return sum / arr.size
    }
}