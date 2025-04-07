package com.mab.cs_prep.algorithms.misc;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Have the function ArrayChallenge(arr) take the array of positive integers stored in arr and return the length of the
 * longest consecutive subsequence (LCS). An LCS is a subset of the original list where the numbers are in sorted order,
 * from lowest to highest, and are in a consecutive, increasing order. The sequence does not need to be contiguous
 * and there can be several different subsequences.
 * For example: if arr is [4, 3, 8, 1, 2, 6, 100, 9] then a few consecutive sequences are [1, 2, 3, 4], and [8, 9].
 * For this input, your program should return 4 because that is the length of the longest consecutive subsequence.
 *
 * Examples:
 * Input: new int[] {6, 7, 3, 1, 100, 102, 6, 12}
 * Output: 2 : [6,7]
 *
 * Input: new int[] {5, 6, 1, 2, 8, 9, 7}
 * Output: 5 : [5, 6, 7, 8, 9]
 *
 * Input: new int[] {4, 3, 8, 1, 2, 6, 100, 9}
 * Output: 4 : [5, 6, 7, 8, 9]
 *
 * Solution Approaches:
 * Naive approach: Sort the array and count whenever a sequence is consecutive, return the biggest one.
 * Not optimal because of the sorting part O(n log n).
 *
 * Optimal solution:
 * Insert all elements of the array into a hash set.
 * Iterate through the array and for each element, check if it is the start of a sequence
 * by ensuring that the element minus one is not in the set. (This is the key).
 * If it is the start, then count the length of the sequence by checking consecutive elements.
 * Keep track of the longest sequence found.
 */
public class LongestConsecutiveSequence {

    // O(n) Optimal solution for getting the LCS.
    public int getLCSOptimal(int[] input) {
        Set<Integer> values = Arrays.stream(input)
                .boxed()
                .collect(Collectors.toSet());

        int lcs = 0;

        for (int num : values) {
            // Check if it's the start of a sequence. (A previous value is not in the set).
            if (!values.contains(num - 1)) {
                int length = 1; // initializes sequence length in 1.

                // Check consecutive numbers of the starting sequence
                while(values.contains(num + 1)) {
                    num++; // increases next number in the sequence
                    length++; // increases the sequence's length
                    lcs = Math.max(length, lcs); // retrieves the maximum value
                }
            }
        }

        return lcs;
    }

    //Naive approach. Time complexity: O(n log n) Because of the sorting part.
    public int getLCS(int[] input) {

        //O(n log n)
        //sort the input
        Arrays.sort(input);

        //Find the LCS
        int lcs = 0;
        int length = 1;

        //O(n)
        for (int i = 0; i < input.length-1; i++) {

            // Is a consecutive sequence?
            if (input[i+1] - input[i] == 1) {
                length++; //increases the length of the sequence
                lcs = Math.max(lcs, length); //computes LCS

            } else { // sequence breaks
                length = 1; // restarts the sequence's length to 1
            }
        }

        return lcs;
    }
}
