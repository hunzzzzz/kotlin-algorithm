package exercise40

import kotlin.math.pow

class Solution {
    fun solution(n: Int): Int {
        return convertBaseNTo10(convertBase10ToN(n, 3).reversed(), 3)
    }

    // 10진법으로 표기된 숫자를 n진법으로 변경
    private fun convertBase10ToN(num: Int, base: Int): String {
        var numBase10 = num
        val numBaseN = StringBuilder()

        while (numBase10 >= base) {
            numBaseN.append(numBase10 % base)
            numBase10 /= base
        }

        numBaseN.append(numBase10)
        return numBaseN.reverse().toString()
    }

    // n진법으로 표기된 숫자를 10진법으로 변경
    private fun convertBaseNTo10(num: String, base: Int): Int {
        var numBase10 = 0
        for (i in num.indices)
            numBase10 += (num[i].code - 48) * base.toDouble().pow(num.length - 1 - i).toInt()
        return numBase10
    }
}