package level3.exercise60

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        val knightList = arrayListOf<Int>()
        var powerSum = 0

        for (i in 1..number)
            knightList.add(getFactors(i))

        for (knight in knightList)
            powerSum += if (knight > limit) power else knight

        return powerSum
    }

    // 약수의 개수를 구하는 메서드
    private fun getFactors(num: Int): Int {
        val factorList = arrayListOf<Int>()

        for (i in 1..num / 2)
            if (num % i == 0)
                factorList.add(i)

        factorList.add(num)
        return factorList.size
    }
}
