package level2.exercise36

class Solution2 {
    fun solution(s: String) = ((s.length == 4) || (s.length == 6)) && s.toIntOrNull() != null
}