package level2.exercise35

class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var nestedFee = 0L
        for (i in 1..count)
            nestedFee += price * i

        val shortage = nestedFee - money.toLong()

        return if (shortage < 0) 0 else shortage
    }
}