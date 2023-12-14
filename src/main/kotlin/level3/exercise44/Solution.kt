package level3.exercise44

class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var maxWidth = 0 // 지갑의 최대 가로 길이
        var maxHeight = 0 // 지갑의 최대 세로 길이

        var max: Int
        var min: Int

        for (list in sizes) {
            max = findMax(list[0], list[1]) // 명함의 가로, 세로 길이 중 큰 값
            min = findMin(list[0], list[1]) // 명함의 가로, 세로 길이 중 작은 값
            if ((max > maxWidth) && (max > maxHeight))
                maxWidth = max
            if (min > maxHeight)
                maxHeight = min
        }
        return maxWidth * maxHeight
    }

    private fun findMax(x: Int, y: Int) = if (x >= y) x else y
    private fun findMin(x: Int, y: Int) = if (x <= y) x else y
}