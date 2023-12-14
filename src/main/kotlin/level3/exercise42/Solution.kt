package level3.exercise42

class Solution {
    fun solution(number: IntArray): Int {
        var count = 0
        for (i in number.indices) {
            for (j in i + 1..number.size - 1) {
                for (k in j + 1..number.size - 1)
                    if (number[i] + number[j] + number[k] == 0)
                        count++
            }
        }
        return count
    }
}