package level1.exercise13

class Solution {
    fun solution(n: Int): Int {
        val numString = n.toString()
        var sum = 0

        for (element in numString)
            sum += Integer.parseInt(element.toString())

        return sum
    }
}