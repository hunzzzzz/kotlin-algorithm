package level3.exercise54

class Solution {
    fun solution(a: Int, b: Int): String {
        val week = arrayListOf("FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU")
        var dayDifference = -1 // 1월 1일과 날짜 차이
        var dayOfMonth: Int // 해당 월에 존재하는 날짜

        for (month in 1..12) {
            dayOfMonth = when (month) {
                1, 3, 5, 7, 8, 10, 12 -> 31
                2 -> 29
                4, 6, 9, 11 -> 30
                else -> -1
            }

            if (month == a) {
                dayDifference += b
                break
            } else
                dayDifference += dayOfMonth
        }

        val dayIndex = dayDifference % week.size // 해당 날짜의 요일 인덱스
        return week[dayIndex]
    }
}