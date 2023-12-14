package level1.exercise21

class Solution2 {
    fun solution(x: Int) = x % x.toString().fold(0) { acc, c -> acc + c.code - 48 } == 0
}

fun main(){
    val ch: Char = '1'
    println(ch.code)
}