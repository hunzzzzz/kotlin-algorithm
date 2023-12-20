package level1.exercise16

class Solution2 {
    fun solution(x: Int, n: Int) = LongArray(n) { x.toLong() * (it + 1) }
}