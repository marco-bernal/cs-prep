package com.mab.cs_prep.algorithms.search;

/**
 * Searches in a Sorted array a given value.
 *
 * Binary search works by dividing the given array exactly in the middle, and validating if the value
 * to search is greater or not, depending on that discards either the left or right exceeding values.
 *
 * O(log n)
 *
 */
class BinarySearch {

    int binarySearch(int[] sortedArray, int valueToSearch) {

        int length = sortedArray.length;
        int middle = length / 2;

        for (int i = 0; i < length; i++) {

            // Discards first half of the array, and updates the middle index.
            if (valueToSearch > sortedArray[middle]) {
                //computes new index for middle. This is the key.
                middle += (length - middle) / 2;
            }

            // Discards second half of the array, and updates the middle index.
            if (valueToSearch < sortedArray[middle]) {
                middle = middle / 2;
            }

            // If number and middle are equal, returns the index.
            if (valueToSearch == sortedArray[middle]) {
                return middle;
            }
        }

        return -1;
    }
}
