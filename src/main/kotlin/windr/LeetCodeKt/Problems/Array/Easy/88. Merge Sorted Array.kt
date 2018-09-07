package windr.LeetCodeKt.Problems.Array.Easy

import windr.LeetCodeKt.Problems.Solution

/**
 * @see <a href="https://leetcode.com/problems/merge-sorted-array/description/">88. Merge Sorted Array</a>
 */
fun Solution.merge(nums1 : IntArray, m : Int, nums2 : IntArray, n : Int) : Unit {
    var i = 0
    var j = 0
    Array(n + m) {
        if (j == n || (i < m && nums1[i] <= nums2[j])) {
            nums1[i++]
        } else {
            nums2[j++]
        }
    }.forEachIndexed { idx, num -> nums1[idx] = num}
}