package level2.exercise37

class Solution2 {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> = Array(arr1.size) { row ->
        IntArray(arr1[0].size) { col ->
            arr1[row][col] + arr2[row][col]
        }
    }
}