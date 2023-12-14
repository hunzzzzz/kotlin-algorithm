package level3.exercise52

class Solution {
    /* Case 1) 2, 1, 20
    cola = (20 / 2) * 1 = 10, bottle = (20 % 2) + 10 = 10, count = 10
    cola = (10 / 2) * 1 = 5, bottle = (10 % 2) + 5 = 5, count = 15
    cola = (5 / 2) * 1 = 2, bottle = (5 % 2) + 2 = 3, count = 17
    cola = (3 / 2) * 1 = 1, bottle = (3 % 2) + 1 = 2, count = 18
    cola = (2 / 2) * 1 = 1, bottle = (2 % 2) + 1 = 1, count = 19
    cola = (1 / 2) * 1 = 0, bottle = (1 % 2) + 0 = 1, count = 19
     */


    /* Case 2) 3, 2, 20
    cola = (20 / 3) * 2 = 12, bottle = (20 % 3) + 12 = 14, count = 12
    cola = (14 / 3) * 2 = 8, bottle = (14 % 3) + 8 = 10, count = 20
    cola = (10 / 3) * 2 = 6, bottle = (10 % 3) + 6 = 7, count = 26
    cola = (7 / 3) * 2 = 4, bottle = (7 % 3) + 4 = 5, count = 30
    cola = (5 / 3) * 2 = 2, bottle = (5 % 3) + 2 = 4, count = 32
    cola = (4 / 3) * 2 = 2, bottle = (4 % 3) + 2 = 3, count = 34
    cola = (3 / 3) * 2 = 2, bottle = (3 % 3) + 2 = 2, count = 36
    cola = (2 / 3) * 2 = 0, bottle = (2 % 3) + 0 = 2, count = 36
     */
    fun solution(a: Int, b: Int, n: Int): Int {
        var cola: Int // 한 사이클에 받은 콜라의 수
        var bottle = n // 한 사이클에 갖게 되는 콜라 병의 수
        var count = 0 // 받은 콜라 수 누적

        do {
            cola = (bottle / a) * b
            bottle = (bottle % a) + cola
            count += cola
        } while (cola != 0)
        return count
    }
}