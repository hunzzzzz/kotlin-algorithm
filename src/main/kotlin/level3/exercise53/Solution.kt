package level3.exercise53

class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        val scoreList = score.toMutableList()
        val hallOfFame = mutableListOf<Int>()
        val answer = mutableListOf<Int>()

        for (i in scoreList.indices) {
            hallOfFame.add(scoreList[i])
            hallOfFame.sortDescending()

            if (hallOfFame.size > k) {
                hallOfFame.removeLast()
                answer.add(hallOfFame[k - 1])
            } else answer.add(hallOfFame[i])
        }
        return answer.toIntArray()
    }
}

fun main() {
    val sol = Solution()
    println(sol.solution(3, intArrayOf(10, 100, 20, 150, 1, 100, 200)).contentToString())
}