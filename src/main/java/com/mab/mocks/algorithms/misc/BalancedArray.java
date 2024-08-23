package com.mab.mocks.algorithms.misc;

import com.mab.mocks.algorithms.model.BalancedResult;

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
    BalancedResult getBalancedArrays(int[] numbers) {
        BalancedResult result = new BalancedResult();
        List<Integer> leftResult = new ArrayList<>();
        List<Integer> rightResult = new ArrayList<>();

        int avg = getAverage(numbers);
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            if (sum <= avg) {
                leftResult.add(numbers[i]);
            }

            if (sum > avg) {
                rightResult.add(numbers[i]);
                sum -= numbers[i];
            }
        }

        result.setLeftList(leftResult);
        result.setRightList(rightResult);

        return result;
    }

    private int getAverage(int[] values) {
        int sum;
        sum = Arrays.stream(values).sum();
        return sum / 2;
    }
}
