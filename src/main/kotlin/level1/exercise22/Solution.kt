package level1.exercise22

class Solution {
    fun solution(a: Int, b: Int): Long {
        var sum = 0L
        if (b > a)
            for (i in a..b)
                sum += i
        else
            for (i in b..a)
                sum += i

        return sum
    }
}