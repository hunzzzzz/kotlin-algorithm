package exercise27

class Solution2 {
    fun solution(phone_number: String): String {
        return "*".repeat(phone_number.length - 4) + phone_number.substring(phone_number.length - 4)
    }
}