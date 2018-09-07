package windr.LeetCodeKt.Problems.Array.Easy

import windr.LeetCodeKt.Problems.Solution
import windr.LeetCodeKt.SolutionTest

fun SolutionTest.testMaxSubArray() {
    val nums = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
    assert(Solution.maxSubArray(nums) == 6)
}