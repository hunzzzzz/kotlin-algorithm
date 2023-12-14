package level1.exercise15

class Solution2 {
    fun solution(n: Int) = (1..n).first { n % it == 1 }
}