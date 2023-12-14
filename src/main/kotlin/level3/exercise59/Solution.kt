package level3.exercise59

class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var count = 1
        var min = section[0]

        for (i in 1 until section.size) {
            if (section[i] - min + 1 > m) {
                count++
                min = section[i]
            }
        }
        return count
    }
}