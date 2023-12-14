package level3.exercise43

class Solution {
    fun solution(t: String, p: String): Int {
        var count = 0

        for (i in 0..t.length - p.length) {
            if (t.substring(i, i + p.length).toLong() <= p.toLong())
                count++
        }

        return count
    }
}