package level1.exercise23

class Solution {
    fun solution(num: Int): Int {
        if (num == 1) return 0

        var x = num.toLong()

        for (count in 1..500) {
            if (x % 2 == 0L)
                x /= 2
            else
                x = x * 3 + 1

            if (x == 1L) return count
        }

        return -1
    }
}