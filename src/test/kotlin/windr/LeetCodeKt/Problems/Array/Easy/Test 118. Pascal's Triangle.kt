package windr.LeetCodeKt.Problems.Array.Easy

import windr.LeetCodeKt.Problems.Solution
import windr.LeetCodeKt.SolutionTest

fun SolutionTest.testPascalsTriangle() {
    val answer = arrayListOf(
            arrayListOf(1),
            arrayListOf(1,1),
            arrayListOf(1, 2, 1),
            arrayListOf(1, 3, 3, 1),
            arrayListOf(1, 4, 6, 4, 1)
    )
    val ret = Solution.generate(numRows = 5)
    assert(ret == answer)
}