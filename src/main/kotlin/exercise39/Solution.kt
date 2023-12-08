package exercise39

class Solution {
    fun solution(n: Int, m: Int): IntArray = intArrayOf(getGCD(n, m), getLCM(n, m))

    // 최소공배수
    private fun getLCM(x: Int, y: Int): Int {
        val max = if (x > y) x else y
        var lcm = max

        while ((lcm % x != 0) || (lcm % y != 0))
            lcm++

        return lcm
    }

    // 최대공약수
    private fun getGCD(x: Int, y: Int): Int {
        val min = if (x > y) y else x

        for (i in min downTo 2)
            if ((x % i == 0) && (y % i == 0))
                return i

        return 1
    }
}
