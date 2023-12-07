package exercise31

class Solution {
    fun solution(n: Int): String {
        val watermelon1 = "수"
        val watermelon2 = "박"
        val answer = StringBuilder()

        for (i in 1..n) {
            if (i % 2 == 1)
                answer.append(watermelon1)
            else
                answer.append(watermelon2)
        }
        return answer.toString()
    }
}