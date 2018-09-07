package windr.LeetCodeKt.Problems.Array.Easy

import windr.LeetCodeKt.Problems.Solution

/**
 * @see <a href="https://leetcode.com/problems/plus-one/description/">66. Plus One</a>
 */
fun Solution.plusOne(digits : IntArray) : IntArray {
    var i = digits.size - 1
    while (i >= 0) {
        digits[i] += 1
        if (digits[i] == 10) {
            digits[i] = 0
            i --
            continue
        }
        break
    }
    return if (i == -1) {
        intArrayOf(1, *digits)
    } else {
        intArrayOf(*digits)
    }
}