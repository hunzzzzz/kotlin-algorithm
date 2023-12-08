package exercise37

class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var rowArray = arrayOf<IntArray>()
        var columnArray = intArrayOf()

        for (i in arr1.indices) {
            for (j in arr1[i].indices)
                columnArray = columnArray.plus(arr1[i][j] + arr2[i][j])
            rowArray = rowArray.plus(columnArray)
            columnArray = intArrayOf()
        }
        return rowArray
    }
}