package level3.exercise50

class Solution2 {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        var lastIndex: Int

        for (i in s.indices) {
            lastIndex = if (i == 0)
                -1
            else s.slice(0..i - 1).lastIndexOf(s[i])

            answer = if (lastIndex == -1)
                answer.plus(lastIndex)
            else
                answer.plus(i - lastIndex)
        }
        return answer
    }
}