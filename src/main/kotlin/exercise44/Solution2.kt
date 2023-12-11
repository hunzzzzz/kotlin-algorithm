package exercise44

import kotlin.math.max
import kotlin.math.min

class Solution2 {
    fun solution(sizes: Array<IntArray>): Int {
        val widths = arrayListOf<Int>()
        val heights = arrayListOf<Int>()

        for (list in sizes) {
            widths.add(max(list[0], list[1]))
            heights.add(min(list[0], list[1]))
        }

        return widths.max() * heights.max()
    }
}