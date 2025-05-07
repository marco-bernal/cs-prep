package com.mab.cs_prep.algorithms.search;

/**
 * Search for a given number in a given array of values. Return -1 if not found.
 *
 * O(n)
 * Naive approach: iterate over the whole array, and compare the value to search for against each value.
 *
 */
public class LinearSearch {

    /**
     * Returns the index of a value if it's found in the input array. Otherwise, returns -1.
     *
     * @param input array of values.
     * @param value value to search for in the input array.
     * @return index of the value found, -1 if not found.
     */
    public int searchValue(int[] input, int value) {

        for (int i = 0; i < input.length; i++) {
            if (input[i] == value) {
                return i;
            }
        }

        return -1;
    }
}
