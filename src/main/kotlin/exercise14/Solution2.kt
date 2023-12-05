package exercise14

class Solution2 {
    fun solution(n: Int) = (1..n / 2).filter { n % it == 0 }.sum() + n
}