package windr.LeetCodeKt.Problems.Array.Easy

import windr.LeetCodeKt.Problems.Solution
import windr.LeetCodeKt.SolutionTest

fun SolutionTest.testMergeSortedArray() {
    val nums1 = intArrayOf(1,2,3,0,0,0)
    val nums2 = intArrayOf(2, 5, 6)
    Solution.merge(nums1, 3, nums2, 3)
    assert(nums1.contentEquals(intArrayOf(1, 2, 2, 3, 5, 6)))
}