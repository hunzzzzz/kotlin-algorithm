package exercise32

class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var innerProduct = 0
        for (i in a.indices) {
            innerProduct += a[i] * b[i]
        }
        return innerProduct
    }
}