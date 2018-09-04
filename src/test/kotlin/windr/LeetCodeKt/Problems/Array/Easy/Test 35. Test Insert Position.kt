package windr.LeetCodeKt.Problems.Array.Easy

import windr.LeetCodeKt.Problems.Solution
import windr.LeetCodeKt.SolutionTest

fun SolutionTest.testSearchInsertPosition() {
    val nums = intArrayOf(1, 3, 5, 6)
    assert(Solution.searchInsert(nums, 5) == 2)
    assert(Solution.searchInsert(nums, 2) == 1)
    assert(Solution.searchInsert(nums, 7) == 4)
    assert(Solution.searchInsert(nums, 0) == 0)
}