package level3.exercise48

class Solution2 {
    fun solution(array: IntArray, commands: Array<IntArray>) = commands.map {
        array.sliceArray(it[0] - 1..it[1] - 1).sorted()[it[2] - 1]
    }
}