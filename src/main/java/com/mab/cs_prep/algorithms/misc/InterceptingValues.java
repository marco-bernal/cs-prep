package com.mab.cs_prep.algorithms.misc;


import java.util.HashMap;
import java.util.Map;

/**
 * Input: Given 2 arrays:
 * int[] a = {2,7,5,15};
 * int[] b = {3,8,99,7,15};
 * Determine which values "intersect":
 *
 * Output:
 * [7,15]
 */
public class InterceptingValues {

    /**
     * There are 2 approaches:
     * Brute force, comparing all elements from both arrays and saving the values that intersect.
     * Quadratic Solution. Non-optimal.
     *
     * Improved approach, store any of the 2 arrays into a HashMap containing the K as the number from the array and a
     * counter as a value V. Then, iterate over the other array and compare if each value exists on the map.
     * If so, increment the counter by one, return the keys that the counter is greater than 1.
     * Linear Solution. Better than the previous one.
     */
    public int[] getInterceptingValues(int[] inputA, int[] inputB) {
        // Map with k: number v: counter = 1
        Map<Integer, Integer> resultMap = new HashMap<>();

        // store inputA values in the resultMap
        for (int n : inputA) {
            resultMap.put(n, 1);
        }

        // compare inputB values and the resultMap
        for (int n : inputB) {

            // validate if the value of inputB exists in the resultMap, if so, increments the counter
            if (resultMap.containsKey(n)) {
                resultMap.put(n, resultMap.get(n) + 1);
            }
        }

        return resultMap.entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
