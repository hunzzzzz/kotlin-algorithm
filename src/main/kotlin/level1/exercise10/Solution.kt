package level1.exercise10

class Solution {
    fun solution(numbers: IntArray): Double {
        var sum = 0.0

        for (num in numbers)
            sum += num

        return sum / numbers.size
    }
}