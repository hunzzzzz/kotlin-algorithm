package level3.exercise48

class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var slicedArray: IntArray
        var answer = intArrayOf()
        for (arr in commands) {
            slicedArray = array.sliceArray(arr[0] - 1..arr[1] - 1)
            bubbleSort(slicedArray)
            answer = answer.plus(slicedArray[arr[2] - 1])
        }
        return answer
    }

    private fun bubbleSort(list: IntArray) {
        var temp = 0

        for (i in list.indices) {
            for (j in 0 until list.size - 1 - i) {
                if (list[j] > list[j + 1]) {
                    temp = list[j]
                    list[j] = list[j + 1]
                    list[j + 1] = temp
                }
            }
        }
    }
}