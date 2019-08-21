package windr.LeetCodeKt.Problems.Array.Easy

import windr.LeetCodeKt.Problems.Solution

const val I = 'I'
const val V = 'V'
const val X = 'X'
const val L = 'L'
const val C = 'C'
const val D = 'D'
const val M = 'M'
val mapper = hashMapOf(
        Pair(I, 1),
        Pair(V, 5),
        Pair(X, 10),
        Pair(L, 50),
        Pair(C, 100),
        Pair(D, 500),
        Pair(M, 1000))

/**
* @see <a href="https://leetcode.com/problems/roman-to-integer/">13. Roman to Integer</a>
 **/
fun Solution.romanToInt(s: String): Int {
    var sum = 0
    var previousChar = ' '
    for (c in s) {
        if (    (previousChar == I && (c == V || c == X)) ||
                (previousChar == X && (c == L || c == C)) ||
                (previousChar == C && (c == D || c == M))) {
            sum -= mapper[previousChar]!! * 2
        }
        sum += mapper[c]!!
        previousChar = c
    }
    return sum
}