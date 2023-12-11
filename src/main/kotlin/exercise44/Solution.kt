package exercise44

class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var maxWidth = 0
        var maxHeight = 0
        var max = 0 //
        var min = 0

        for (list in sizes) {
            max = findMax(list[0], list[1])
            min = findMin(list[0], list[1])
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