package exercise33

class Solution {
    fun solution(left: Int, right: Int): Int {
        var sum = 0
        for (i in left..right) {
            if (getDivisor(i).size % 2 == 0)
                sum += i
            else
                sum -= i
        }
        return sum
    }

    private fun getDivisor(n: Int): List<Int> {
        val divisorList = mutableListOf<Int>()
        for (i in 1..n / 2) {
            if (n % i == 0)
                divisorList.add(i)
        }
        divisorList.add(n)
        return divisorList
    }
}