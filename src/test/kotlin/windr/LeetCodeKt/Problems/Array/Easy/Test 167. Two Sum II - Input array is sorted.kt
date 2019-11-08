package windr.LeetCodeKt.Problems.Array.Easy

import windr.LeetCodeKt.Problems.Solution
import windr.LeetCodeKt.SolutionTest

fun SolutionTest.testTwoSum2() {
    val input = intArrayOf(-1, 0)
    val target = -1
    val output = intArrayOf(1, 2)
    assert(Solution.twoSum2(input, target).contentEquals(output))
}