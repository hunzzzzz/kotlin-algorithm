package level3.exercise58

class Solution {
    fun solution(nums: IntArray): Int {
        val sumList = arrayListOf<Int>()
        var countOfPrimeNum = 0

        for (i in nums.indices)
            for (j in i + 1 until nums.size)
                for (k in j + 1 until nums.size)
                    sumList.add(nums[i] + nums[j] + nums[k])

        for (sum in sumList)
            if (isPrimeNumber(sum))
                countOfPrimeNum++

        return countOfPrimeNum
    }

    private fun isPrimeNumber(num: Int): Boolean {
        for (i in 2 until num) {
            if (num % i == 0)
                return false
        }
        return true
    }
}