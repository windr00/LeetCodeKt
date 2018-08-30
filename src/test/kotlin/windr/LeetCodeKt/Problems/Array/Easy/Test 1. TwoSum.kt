package windr.LeetCodeKt.Problems.Array.Easy
import io.kotlintest.shouldBe
import windr.LeetCodeKt.TestBase

fun TestBase.testTwoSum() {
    Solution.twoSum(intArrayOf(2, 7, 11, 15), 9) shouldBe intArrayOf(0, 1)
}
