package level2.exercise36

class Solution {
    fun solution(s: String): Boolean {
        if ((s.length != 4) && (s.length != 6)) return false
        for (ch in s) if ((ch.code < 48) || (ch.code > 57)) return false

        return true
    }
}