package com.mab.cs_prep.algorithms.recursion;

public class RecursiveLinearSearch {

    public int recursiveLinearSearch(int[] input, int i, int valueToSearch) {
        //base cases
        if(i > input.length) {
            return -1;
        } else if (input[i] == valueToSearch) {
            return i;
        } else { //recursive case
         return recursiveLinearSearch(input, i + 1, valueToSearch);
        }
    }
}
