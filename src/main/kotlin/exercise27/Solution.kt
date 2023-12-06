package exercise27

class Solution {
    fun solution(phone_number: String): String {
        var encodedNumber = ""
        for (i in phone_number.indices) {
            if (i < phone_number.length - 4)
                encodedNumber += "*"
            else
                encodedNumber += phone_number[i]
        }
        return encodedNumber
    }
}