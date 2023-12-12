package exercise50

class Solution3 {
    fun solution(s: String) =
        s.withIndex().map { (i, c) -> s.slice(0 until i).lastIndexOf(c).let { if (it >= 0) i - it else -1 } }
}