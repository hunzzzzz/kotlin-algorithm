package exercise38

class Solution {

}

fun main(args: Array<String>) {
    val (a, b) = readln().split(' ').map(String::toInt)
    for (i in 1..b) {
        print("*".repeat(a))
        println()
    }
}