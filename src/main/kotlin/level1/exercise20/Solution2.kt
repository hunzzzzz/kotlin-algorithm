package level1.exercise20

class Solution2 {
    fun solution(n: Long) = String(n.toString().toCharArray().sortedArrayDescending()).toLong()
}