package exercise29

class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = intArrayOf()

        if (arr.size <= 1)
            answer += -1
        else {
            val min = findMin(arr)

            for (num in arr) {
                if (num != min)
                    answer += num
            }
        }
        return answer
    }

    private fun findMin(arr: IntArray): Int {
        var min = arr[0]

        for (element in arr) {
            if (element < min)
                min = element
        }

        return min
    }
}