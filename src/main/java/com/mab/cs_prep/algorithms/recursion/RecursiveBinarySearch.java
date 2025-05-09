package com.mab.cs_prep.algorithms.recursion;

public class RecursiveBinarySearch {

    int recursiveBinarySearch(int[] sortedArray, int valueToSearch, int i, int middle) {
        int length = sortedArray.length;

        //base case
        if (i > length) { //value not found
            return -1;
        } else { //recursive cases
            if (valueToSearch > sortedArray[middle]) { //right
                middle = (length + middle) / 2; // key
                return recursiveBinarySearch(sortedArray, valueToSearch, i + 1, middle);

            } else if (valueToSearch < sortedArray[middle]) { //left
                middle = middle / 2; // key
                return recursiveBinarySearch(sortedArray, valueToSearch, i + 1, middle);

            } else if (valueToSearch == sortedArray[middle]) {
                return middle;
            }
        }
        return -1;
    }
}
