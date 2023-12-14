package level1.exercise17

class Solution2 {
    fun solution(n: Long) = n.toString().reversed().map { it.digitToInt() }.toIntArray()
}