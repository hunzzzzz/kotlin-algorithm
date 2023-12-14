package level1.exercise25

class Solution2 {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()
        for (num in arr)
            if (num % divisor == 0)
                answer = answer.plus(num)
        answer.sort()

        if (answer.isEmpty())
            answer = answer.plus(-1)

        return answer
    }
}