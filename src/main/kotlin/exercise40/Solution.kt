package exercise40

import kotlin.math.pow

class Solution {
    fun solution(n: Int): Int {
        return convertBaseNTo10(convertBase10ToN(n, 3, true), 3)
    }

    // 10진법으로 표기된 숫자를 n진법으로 변경
    private fun convertBase10ToN(num: Int, base: Int, isReversed: Boolean): String {
        var numBase10 = num
        val numBaseN = StringBuilder()

        while (numBase10 >= base) {
            numBaseN.append(num % base)
            numBase10 /= base
        }

        numBaseN.append(numBase10)
        return if (isReversed) numBaseN.toString() else numBaseN.reverse().toString()
    }

    private fun convertBaseNTo10(num: String, base: Int): Int {
        var numBase10 = 0
        for (i in num.length - 1 downTo 0)
            numBase10 += (num[i].code - 48) * base.toDouble().pow(num.length - 1 - i).toInt()
        return numBase10
    }
}