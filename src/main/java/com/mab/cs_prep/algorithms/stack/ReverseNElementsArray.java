package com.mab.cs_prep.algorithms.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Problem: Given an array and a target number, reverse the first N elements of the array based on the target number
 * while keeping the rest of the array in the same order.
 * You need to use a queue to temporarily store and reverse the first N elements.
 *
 * Input:
 * arr: An array of N integers.
 * target: An integer representing the number of elements to reverse.
 *
 * Output:
 * Return the modified array with the first target elements reversed.
 *
 * Test Cases:
 * Input: arr = [1, 2, 3, 4, 5], target = 3
 * Output: [3, 2, 1, 4, 5]
 * Explanation: The first 3 elements [1, 2, 3] are reversed, while the rest [4, 5] remain unchanged.
 *
 * Input: arr = [1, 2, 3, 4], target = 4
 * Output: [4, 3, 2, 1]
 * Explanation: All 4 elements are reversed because B equals the array length.
 *
 * Input: arr = [5, 6, 7], target = 1
 * Output: [5, 6, 7]
 * Explanation: Only the first element is considered for reversal, so the array remains the same.
 *
 * Input: arr = [10, 20, 30, 40, 50], target = 0
 * Output: [10, 20, 30, 40, 50]
 * Explanation: Since B = 0, no elements are reversed, and the array stays in its original order.
 *
 * Constraints:
 * 1 <= B <= arr.length <= 10^5
 */
public class ReverseNElementsArray {

    public int[] getReversedArray(int[] input, int target) {
        int[] result = new int[input.length];
        // Makes no sense to use a Queue (FIFO) same as a traditional array. Using a Stack instead.
        //TODO: Find real usages for a queue.
        Deque<Integer> stack = new ArrayDeque<>();

        //reverse elements
        for (int i = 0; i < target; i++) {
            stack.push(input[i]);
        }

        //add reversed elements to array
        for (int i = 0; i < target; i++) {
            result[i] = stack.pop();
        }

        //add remaining elements
        for (int i = target; i < input.length; i++) {
            result[i] = input[i];
        }

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                System.out.println(i + " " + j);
            }
        }

        return result;
    }
}
