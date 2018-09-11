package windr.LeetCodeKt.Problems.Array.Easy

import windr.LeetCodeKt.Problems.Solution

/**
 * @see <a href="https://leetcode.com/problems/pascals-triangle/description/">118. Pascal's Triangle</a>
 */
fun Solution.generate(numRows: Int): List<List<Int>> {
    val ret = ArrayList<List<Int>>()
    (0 until numRows).forEach { level ->
        val array = arrayListOf(1)
        (1 until level).forEach {
            val lastLevel = ret[level - 1]
            array.add(lastLevel[it - 1] + lastLevel[it])
        }
        if (level != 0) {
            array.add(1)
        }
        ret.add(array)
    }
    return ret
}