package exercise56

class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        val scoreList = score.sortedDescending().toMutableList()
        var box = mutableListOf<Int>()
        var profit = 0

        for (i in 0 until scoreList.size step m) {
            if (i + m > scoreList.size)
                break
            else {
                box = if (i + m == scoreList.size) scoreList.subList(i, scoreList.size) else scoreList.subList(i, i + m)
                profit += box.minOf { it } * m
            }
        }

        return profit
    }
}