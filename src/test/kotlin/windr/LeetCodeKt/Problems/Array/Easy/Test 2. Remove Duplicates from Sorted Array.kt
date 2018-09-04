package windr.LeetCodeKt.Problems.Array.Easy

import windr.LeetCodeKt.Problems.Solution
import windr.LeetCodeKt.TestBase
import java.util.*

fun TestBase.testRemoveDuplicatesFromSotedArray() {
    val nums = intArrayOf(0,0,1,1,1,2,2,3,3,4)
    val ret = Solution.removeDuplicates(nums)
    val after = Arrays.copyOf(nums, ret)!!
    assert(ret == 5)
    assert(after.contentEquals(intArrayOf(0, 1, 2, 3, 4)))
}