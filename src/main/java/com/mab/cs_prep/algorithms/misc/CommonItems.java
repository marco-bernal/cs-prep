package com.mab.cs_prep.algorithms.misc;

import java.util.*;
import java.util.stream.Stream;

/**
 * Given 2 arrays, create a function that let a user know (true / false)
 * whether these two arrays contain any common items. For example:
 * ['a','d','g','y','h','m']
 * ['w','d','x','m','z','k']
 * True
 *
 * ['h','t','q']
 * ['b','v','e','l']
 * False
 *
 * TODO: Explain solution approaches. Enhance with for each loops / streams if possible.
 **/
class CommonItems {

    //Brute force approach O(n^2) Quadratic. Not efficient
    boolean hasCommonItems(String[] input1, String[] input2) {

        for (int i = 0; i < input1.length; i++) {
            for (int j = 0; j < input2.length; j++) {

                if (input1[i].equals(input2[j])) {
                    return true;
                }
            }
        }

        return false;
    }

    //Refactored solution, more efficient O(n) Linear
    boolean hasCommonItemsRefactored(String[] input1, String[] input2) {
        // merges both input arrays into one
        String[] joinArray = joinArrays(input1, input2);
        List<String> strings = new ArrayList<>();

        // iterates over the array, if the string is contained, returns true. Otherwise, false.
        for (String string : joinArray) {
            if (strings.contains(string)) {
                return true;
            }
            strings.add(string);
        }
        return false;
    }

    private String[] joinArrays(String[] input1, String[] input2) {
        return Stream.concat(Arrays.stream(input1), Arrays.stream(input2))
                .toArray(String[]::new);
    }
}
