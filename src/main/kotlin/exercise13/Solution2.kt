package exercise13

class Solution2 {
    fun solution(n: Int): Int {
        var sum = 0
        var inputNum = n

        while (inputNum != 0) {
            sum += (inputNum % 10)
            inputNum /= 10
        }

        return sum
    }
}