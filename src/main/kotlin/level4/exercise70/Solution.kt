package level4.exercise70

class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var minLux = 50
        var minLuy = 50
        var maxRdx = 0
        var maxRdy = 0

        for (i in wallpaper.indices) {
            for (j in wallpaper[i].indices) {
                if (wallpaper[i][j] == '#') {
                    println("$i $j")
                    if (i < minLux) minLux = i
                    if (i + 1 > maxRdx) maxRdx = i + 1
                    if (j < minLuy) minLuy = j
                    if (j + 1 > maxRdy) maxRdy = j + 1
                }
            }
        }

        return intArrayOf(minLux, minLuy, maxRdx, maxRdy)
    }
}