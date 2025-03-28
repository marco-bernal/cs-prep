package com.mab.cs_prep.algorithms.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Problem: Given a string containing only the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid (i.e., if the parentheses are balanced).
 *
 * Rules:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order (LIFO: Last In First Out).
 *
 * Examples:
 * Input: "()"  → Output: True
 * Input: "([])"  → Output: True
 * Input: "([)]" → Output: False
 * Input: "(([]))" → Output: True
 * Input: "[" → Output: False
 *
 * Constraints:
 * The string length will not exceed 10^4.
 */
public class ValidParenthesis {

    public boolean isValidParenthesis(String string) {
        Deque<Character> values = new ArrayDeque<>();

        for (Character c : string.toCharArray()) {
            if (c.equals('(') || c.equals('{') || c.equals('[')) {
                values.push(c);
            }

            if (c.equals(')') || c.equals('}') || c.equals(']')) {
                values.pop();
            }
        }

        return values.isEmpty();
    }
}
