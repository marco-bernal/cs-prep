package com.mab.cs_prep.algorithms.stack;

import com.mab.cs_prep.ds.stack.BareStack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Reverse String algorithm using the BareStack and the Collections class.
 *
 * The Problem: Reversing a string means taking the last character and moving it to the front,
 * then taking the second-last character and placing it second, and so on, until all the characters are reversed.
 *
 * Input: "hello"
 * Output: "olleh"
 *
 * Solution:
 * We can solve this problem using a stack. Since a stack works on the Last In, First Out (LIFO) principle,
 * it's a perfect fit for this task.
 * We'll push each character of the string onto the stack and then pop them off,
 * which will give us the characters in reverse order. Always use StringBuilder to create Strings.
 */
public class ReverseStringWithStack {

    public String getReversedStringWithBareStack(String input) {
        BareStack stack = new BareStack(input.length());
        StringBuilder result = new StringBuilder();

        // O(n)
        for (int i=0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // O(n)
        for (int i=0; i < input.length(); i++) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    // Use this as preferred way to dealing with this problem.
    public String getReversedStringWithArrayDequeAndStringBuilder(String input) {
        // The Interface Deque can be used to create an ArrayDeque that implements a Stack.
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();

        // O(n)
        for (int i=0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // O(n)
        for (int i=0; i < input.length(); i++) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public String getReversedStringWithArrayDequeAndCharArray(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] tmp = new char[input.length()];

        // O(n)
        for (Character c : input.toCharArray()) {
            stack.push(c);
        }

        // O(n)
        for (int i=0; i < input.length(); i++ ) {
            tmp[i] = stack.pop();
        }

        return String.valueOf(tmp);
    }
}
