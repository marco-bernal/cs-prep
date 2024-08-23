package com.mab.mocks.algorithms.misc;

/**
 * Given an array of integers, return an array that the value at index i of the output is the product
 * of every other value in the array except for the value at index i.
 *
 * Edge cases:
 * An empty list should return[]
 * A list of length = 1 should return [1]
 *
 * Example:
 * input: product_exclusion([2,3,4,5])
 * output: [60, 40, 30, 24]
 *
 * TODO: Explain solution approaches. Enhance with for each loops / streams if possible.
 */

public class ProductExclusion {

    //(On^2) Quadratic / Exponential. Not good
    int[] getProduct(int[] input) {

        //If the input is empty, returns an empty array
        if (input.length == 0) {
            return new int[] {};
        }

        //If the input has only one element, returns that element
        if (input.length == 1) {
            return input;
        }

        int[] result = new int[input.length];

        // loops 4 times the values of the array
        for (int i = 0; i < input.length; i++) {

            int product = 1;

            //computes the product skipping the index value
            for (int j = 0; j < input.length; j++) {
                if (i != j) {
                    product *= input[j];
                }
            }

            result[i] = product;
        }

        return result;
    }

    // (On) Linear
    int[] getProductImproved(int[] input) {
        int[] result = new int[input.length];

        int totalProduct = 1;

        //computes the total product
        for (int value : input) {
            totalProduct *= value;
        }

        //computes the result by dividing the total product by the index
        for (int i = 0; i < input.length; i++) {
            result[i] = totalProduct / input[i];
        }

        return result;
    }
}
