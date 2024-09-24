package com.mab.cs_prep.algorithms.misc;


import com.mab.cs_prep.algorithms.model.Result;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

import static java.util.Comparator.comparingInt;

/**
 * Given an array of N size retrieves the largest and smallest numbers
 * Example:
 * [12,4,6,43,8,99,0,1] -> [0,99]
 *
 * TODO: Explain solution approaches. Enhance with for each loops / streams if possible.
 */
class FindGreatestSmallest {

    Result getMaxAndMin(int[] values) {
        int smallest = values[0];
        int greatest = values[0];

        for (int i = 0; i < values.length; i++) {
            if (values[i] < smallest) {
                smallest = values[i];
            }
            if (values[i] > greatest) {
                greatest = values[i];
            }
        }

        return new Result(smallest, greatest);
    }

    int[] getMaxAndMinAsArray(int[] values) {
        int[] result = new int[2];

        OptionalInt max = getMaxValueFromArray(values);
        OptionalInt min = getMinValueFromArray(values);

        int maxInt;
        int minInt;

        //this isn't working inside a stream, find out why!
        if (max.isPresent()) {
            maxInt = max.getAsInt();
            result[0] = maxInt;
        }

        if (min.isPresent()) {
            minInt = min.getAsInt();
            result[1] = minInt;
        }

        return result;
    }

    private Optional<Integer> getMaxValueFromList(List<Integer> values) {
        return values.stream()
                .reduce(Integer::max);
    }

    private Optional<Integer> getMinValueFromList(List<Integer> values) {
        return values.stream()
                .min(comparingInt(Integer::valueOf));
    }

    private OptionalInt getMaxValueFromArray(int[] values) {
        return Arrays.stream(values)
                .reduce(Integer::max);
    }

    private OptionalInt getMinValueFromArray(int[] values) {
        return Arrays.stream(values)
                .reduce(Integer::min);
    }
}

