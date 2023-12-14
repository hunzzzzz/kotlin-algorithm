package level1.exercise14

class Solution {
    fun solution(n: Int): Int {
        var sum = 0

        for (i in 1..n / 2) {
            if (n % i == 0) {
                sum += i
            }

        }

        return sum + n

    }
}