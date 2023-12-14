package level1.exercise25

class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = intArrayOf()
        for (num in arr)
            if (num % divisor == 0)
                answer = answer.plus(num)
        bubbleSort(answer)

        if (answer.isEmpty())
            answer = answer.plus(-1)

        return answer
    }

    private fun bubbleSort(arr: IntArray) {
        var temp = 0
        for (i in arr.indices) {
            for (j in 0 until arr.size - 1 - i) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp
                }
            }
        }
    }
}