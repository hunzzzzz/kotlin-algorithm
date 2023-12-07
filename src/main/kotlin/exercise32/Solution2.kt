package exercise32

class Solution2 {
    fun solution(a: IntArray, b: IntArray) = a.zip(b).map { it.first * it.second }.sum()
}