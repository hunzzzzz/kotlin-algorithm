package exercise31

class Solution2 {
    fun solution(n: Int) = CharArray(n) { if (it % 2 == 0) '수' else '박' }.contentToString()
}