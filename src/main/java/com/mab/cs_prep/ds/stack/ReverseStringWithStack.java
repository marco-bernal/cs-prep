package com.mab.cs_prep.ds.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Reverse String algorithm using the BareStack and the Collections  class.
 */
public class ReverseStringWithStack {

    public String getReversedStringWithBareStack(String input) {
        BareStack stack = new BareStack(input.length());
        StringBuilder result = new StringBuilder();

        for (int i=0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        for (int i=0; i < input.length(); i++) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public String getReversedStringWithArrayDeque(String input) {
        // The Interface Deque can be used to create an ArrayDeque that implements a Stack.
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();

        for (int i=0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        for (int i=0; i < input.length(); i++) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}
