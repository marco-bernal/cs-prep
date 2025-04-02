package com.mab.cs_prep.algorithms.misc;

/**
 * The Problem: Reversing a string means taking the last character and moving it to the front,
 * then taking the second-last character and placing it second, and so on, until all the characters are reversed.
 *
 * Input: "hello"
 * Output: "olleh"
 *
 * Solution:
 * This approach doesn't use a Stack. It uses ana array or queue like structure (An array can be seen as a FIFO structure).
 * The implementation basically takes the last position of the array (or the tail of the queue) iterating it backwards
 * and adds the values to the reversed string until is totally iterated. Always use StringBuilder to create Strings.
 */
public class ReverseStringWithArray {

    String reverseString(String string) {
        StringBuilder reversed = new StringBuilder();

        for (int i = string.length() - 1; i >= 0; i--) {
            reversed.append(string.charAt(i));
        }
        return reversed.toString();
    }
}
