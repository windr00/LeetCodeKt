package windr.LeetCodeKt.Problems.Array.Easy

import windr.LeetCodeKt.Problems.Solution
import java.util.*

/**
 * @see <a href="https://leetcode.com/problems/valid-parentheses/">`20. Valid Parentheses`</a>
 **/
fun Solution.isValid(s: String): Boolean {
    if (s.isEmpty()) {
        return true
    }
    val stack = Stack<Char>()
    (0 until s.length).forEach {
        val c = s[it]
        if (!stack.empty()) {
            val peek = stack.peek()
            if ((peek == '(' && c == ')') || (peek == '[' && c == ']') || (peek == '{' && c == '}')) {
                stack.pop()
            } else {
                stack.push(c)
            }
        } else {
            stack.push(c)
        }
    }
    return stack.empty()
}

fun main(args: Array<String>) {
    Solution.isValid("([)")
}