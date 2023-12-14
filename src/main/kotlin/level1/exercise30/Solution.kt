package level1.exercise30

class Solution {
    fun solution(s: String): String {
        return if (s.length % 2 == 1) {
            s[(s.length - 1) / 2].toString()
        } else
            s.substring(s.length / 2 - 1, s.length / 2 + 1)
    }
}