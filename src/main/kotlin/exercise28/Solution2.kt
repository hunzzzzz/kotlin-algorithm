package exercise28

class Solution2 {
    fun solution(numbers: IntArray) = (0..9).filter { !numbers.contains(it) }.sum()
}