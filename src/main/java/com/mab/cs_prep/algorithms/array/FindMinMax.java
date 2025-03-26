package com.mab.cs_prep.algorithms.array;

/**
 * Find Minimum and Maximum
 * Problem:
 * You are given an array of N integers.
 * Your task is to scan the array and determine both the minimum and maximum values within it.
 *
 * Input: numbers: An array of N integers.
 * Output: result: Array of two values that stores the minimum value and the maximum value found in the array.
 *
 * Constraints:
 * The array might contain one or more elements.
 * If the array is empty, you should handle this edge case appropriately (for example, by returning a specific message or using default values).
 */
public class FindMinMax {

    public int[] findMinMaxValues(int[] input) {
        int[] result = new int[2];
        // initialize the first value in the input as the min value
        int min = input[0];
        // initialize the first value in the input as the max value
        int max = input[0];

        for (int i = 0; i < input.length; i++) {

            if (input[i] < min) {
                min = input[i];
            }

            if (input[i] > max) {
                max = input[i];
            }
        }

        result[0] = min;
        result[1] = max;

        return result;
    }

    public int[] findMinMaxValuesEnhanced(int[] values) {
        // initialize the first value in the input as the min value
        int min = values[0];
        // initialize the first value in the input as the max value
        int max = values[0];

        for (int value : values) {

            if (value < min) {
                min = value;
            }

            if (value > max) {
                max = value;
            }
        }

        return new int[] {min, max};
    }
}
