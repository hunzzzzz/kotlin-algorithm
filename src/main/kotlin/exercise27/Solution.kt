package exercise27

class Solution {
    fun solution(phone_number: String): String {
        var encodedNumber = StringBuilder()
        for (i in phone_number.indices) {
            if (i < phone_number.length - 4)
                encodedNumber.append("*")
            else
                encodedNumber.append(phone_number[i])
        }
        return encodedNumber.toString()
    }
}