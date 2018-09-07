package windr.LeetCodeKt.Problems.Array.Easy

import windr.LeetCodeKt.Problems.Solution
import windr.LeetCodeKt.SolutionTest

fun SolutionTest.testPlusOne() {
    assert(Solution.plusOne(intArrayOf(1, 2, 3)).contentEquals(intArrayOf(1, 2, 4)))
    assert(Solution.plusOne(intArrayOf(4, 3, 2, 1)).contentEquals(intArrayOf(4, 3, 2, 2)))
}