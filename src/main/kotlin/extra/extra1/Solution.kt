package extra.extra1

/*
프로그래머스 : 분수의 덧셈
https://school.programmers.co.kr/learn/courses/30/lessons/120808
*/

class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var numer = numer1 * denom2 + numer2 * denom1 // 분자
        var denom = denom1 * denom2 // 분모
        var min: Int // 반복문의 최대 횟수

        // 분자와 분모의 최대공약수가 1이 될때까지 약분 실시
        while (getGCD(numer, denom) != 1) {
            min = if (numer < denom) numer else denom
            for (i in 2..min) {
                if ((numer % i == 0) && (denom % i == 0)) {
                    numer /= i
                    denom /= i
                    break
                }
            }
        }
        return intArrayOf(numer, denom)
    }

    // 최대공약수를 구하는 메서드 (Greatest Common Divisor : GCD)
    private fun getGCD(x: Int, y: Int): Int {
        val min = if (x < y) x else y
        for (i in min downTo 2) {
            if ((x % i == 0) && (y % i == 0))
                return i
        }
        return 1
    }
}