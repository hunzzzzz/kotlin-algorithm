package level3.exercise51

class Solution {
    fun solution(food: IntArray): String {
        val answer = StringBuilder()
        for (i in 1..food.size - 1)
            answer.append(i.toString().repeat(food[i] / 2))
        answer.append("0")
        for (i in food.size - 1 downTo 1)
            answer.append(i.toString().repeat(food[i] / 2))

        return answer.toString()
    }
}