package level3.exercise53

import java.util.PriorityQueue

class Solution2 {
    fun solution(k: Int, scoreArray: IntArray): IntArray {
        val hallOfFame = PriorityQueue<Int>() // 오름차순 Queue
        val answer = mutableListOf<Int>()

        for (score in scoreArray) {
            hallOfFame.add(score)
            if (hallOfFame.size > k)
                hallOfFame.poll()
            answer.add(hallOfFame.peek())
        }

        return answer.toIntArray()
    }
}