package com.mab.cs_prep.algorithms.search;

/**
 * Searches in a Sorted array a given value.
 *
 * Binary search works by dividing the given array exactly in the middle, and validating if the value
 * to search is greater or not, depending on that discards either the left or right exceeding values.
 *
 * The key is to update the middle pointer to the left or right, depending on the value to search
 * and the value of the middle pointer.
 *
 * O(log n)
 */
class BinarySearch {

    /**
     * Finds an element by implementing the Binary Search algorithm. Use this one!
     * Important note is the input array MUST be sorted.
     *
     * @param sortedArray input array.
     * @param valueToSearch x value to be found.
     * @return index of the value to search.
     */
    int binarySearch(int[] sortedArray, int valueToSearch) {

        int length = sortedArray.length;
        int middle = length / 2;

        for (int i : sortedArray) {
            // Discards first half of the array, and updates the middle pointer.
            if (valueToSearch > sortedArray[middle]) {
                //computes new index for middle. This is the key.
                middle = (length + middle) / 2;
            } // Discards second half of the array, and updates the middle pointer.
            else if (valueToSearch < sortedArray[middle]) {
                middle = middle / 2;
            } // If number and middle pointer are equal, returns the index.
            else if (valueToSearch == sortedArray[middle]) {
                return middle;
            }
        }
        return -1;
    }

    // Don't use this version
    int anotherBinarySearch(int[] sortedArray, int valueToSearch) {
        int p1 = 0;
        int p2 = sortedArray.length;

        while (p1 < p2) {

            int middle = (p1 + p2) / 2;

            if (valueToSearch < sortedArray[middle]) {
             p2 = middle - 1;
            } else if (valueToSearch > sortedArray[middle]) {
                p1 = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}