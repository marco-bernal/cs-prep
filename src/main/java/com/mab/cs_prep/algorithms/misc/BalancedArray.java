package com.mab.cs_prep.algorithms.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an unsorted array of any size that might contain positive, zero and negative values.
 * Split it into 2 arrays that the sum of the values inside each one is equals or the closest between
 * Example:
 * [1,2,3,4,10] -> [1,2,3,4] [10]
 * [1,3,7,4,16,0,20] -> [20,4,1] [16,7,3]
 * [-1,1,0,1,0,1] -> [1] [1]
 *
 * TODO: Explain solution approaches. Enhance with for each loops / streams if possible.
 */ 
class BalancedArray {

    //New proposal that seems to solve to problem more efficiently: SOLVED!
    List<int[]> getBalancedArrays(int[] numbers) {
        List<int[]> result = new ArrayList<>();
        List<Integer> leftValues = new ArrayList<>();
        List<Integer> rightValues = new ArrayList<>();

        int avg = getAverage(numbers);
        int sum = 0;

        for (int number : numbers) {
            sum += number;

            if (sum <= avg) {
                leftValues.add(number);
            }

            if (sum > avg) {
                rightValues.add(number);
                sum -= number;
            }
        }

        result.add(
                leftValues.stream()
                        .mapToInt(Integer::intValue)
                        .toArray()
        );

        result.add(
          rightValues.stream()
                  .mapToInt(Integer::intValue)
                  .toArray()
        );

        return result;
    }

    private int getAverage(int[] values) {
        int sum = Arrays.stream(values).sum();
        return sum / 2;
    }
}
