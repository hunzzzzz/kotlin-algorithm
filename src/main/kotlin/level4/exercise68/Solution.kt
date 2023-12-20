package level4.exercise68

import java.util.Stack

class Solution {
    fun solution(ingredient: IntArray): Int {
        val stack = Stack<Int>()
        var burger = 0

        for (num in ingredient) {
            stack.add(num)

            if (stack.size >= 4 && stack.subList(stack.size - 4, stack.size) == arrayListOf(1, 2, 3, 1)) {
                for (i in 1..4) stack.pop()
                burger++
            }
        }

        return burger
    }
}