class Solution {
    fun solution(x: Int): Boolean {
        var digitSum = 0
        val xString = x.toString()

        for (ch in xString)
            digitSum += ch.digitToInt()

        return x % digitSum == 0
    }
}