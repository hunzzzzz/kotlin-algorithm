package level1.exercise26

class Solution2 {
    fun solution(absolutes: IntArray, signs: BooleanArray) =
        absolutes.foldIndexed(0) { i, acc, num -> acc + if (signs[i]) num else -num }
}