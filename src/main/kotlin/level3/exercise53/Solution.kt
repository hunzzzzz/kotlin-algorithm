package level3.exercise53

class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        val hallOfFame = mutableListOf<Int>()
        val answer = mutableListOf<Int>()

        for (i in score.indices) {
            hallOfFame.add(score[i])
            hallOfFame.sortDescending()

            if (hallOfFame.size > k) {
                hallOfFame.removeLast()
                answer.add(hallOfFame[k - 1])
            } else answer.add(hallOfFame[i])
        }
        return answer.toIntArray()
    }
}