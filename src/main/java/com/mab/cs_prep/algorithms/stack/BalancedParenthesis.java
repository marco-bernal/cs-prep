package com.mab.cs_prep.algorithms.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Check to see if a string of parentheses is balanced or not.
 *
 * By "balanced," we mean that for every open parenthesis, there is a matching closing parenthesis in the correct order.
 * For example, the string "((()))" has three pairs of balanced parentheses, so it is a balanced string.
 * On the other hand, the string "(()))" has an imbalance, as the last two parentheses do not match, so it is not balanced.
 * Also, the string ")(" is not balanced because the close parenthesis needs to follow the open parenthesis.
 *
 * Your program should take a string of parentheses as input and return true if it is balanced, or false if it is not.
 * Test cases:
 *         (), true
 *         ()(), true
 *         (()), true
 *         ()()(), true
 *         (()()), true
 *         ((), false
 *         )()(, false
 *         )(, false
 *         )), false
 *         ), false
 *         (, false
 */
public class BalancedParenthesis {

    public boolean isBalancedParenthesis(String input) {
        Deque<Character> stack = new ArrayDeque<>();

        for (Character c : input.toCharArray()) {
            //validate if closing parenthesis
            if (c.equals(')') && stack.isEmpty()) {
                return false;
            }

            //Add opening parenthesis
            if (c.equals('(')) {
                stack.push(c);
            }

            //remove parenthesis
            if (c.equals(')') && !stack.isEmpty() && stack.peek().equals('(')) {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
