package windr.LeetCodeKt.Problems.Array.Easy

import windr.LeetCodeKt.Problems.Solution
import windr.LeetCodeKt.SolutionTest
import java.util.*

fun SolutionTest.testRemoveElement() {
    val nums = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
    val `val` = 2
    val ret = Solution.removeElement(nums, `val`)
    val copied = Arrays.copyOf(nums, ret)
    assert(ret == 5)
    assert(copied.filter { it == 1 }.size == 1)
    assert(copied.filter { it == 3 }.size == 1)
    assert(copied.filter { it == 4 }.size == 1)
    assert(copied.filter { it == 0 }.size == 2)

}