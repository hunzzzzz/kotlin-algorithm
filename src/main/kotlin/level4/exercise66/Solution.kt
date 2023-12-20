package level4.exercise66

class Solution {
    companion object {
        const val MAXIMUM_LENGTH = 100
    }

    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        val answer = arrayListOf<Int>()
        var count: Int
        var minIndex: Int

        for (target in targets) {
            count = 0
            for (i in target.indices) {
                minIndex = MAXIMUM_LENGTH
                for (str in keymap) {
                    if (str.contains(target[i]) && str.indexOfFirst { it == target[i] } < minIndex) {
                        minIndex = str.indexOfFirst { it == target[i] }
                    }
                }
                if (minIndex == MAXIMUM_LENGTH) {
                    count = 0
                    break
                } else count += minIndex + 1
            }
            if (count == 0) answer.add(-1) else answer.add(count)
        }
        return answer.toIntArray()
    }
}