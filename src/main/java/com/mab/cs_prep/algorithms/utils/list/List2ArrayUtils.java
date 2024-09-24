package com.mab.cs_prep.algorithms.utils.list;

import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class List2ArrayUtils {

    /**
     * Converts a String List to a String array.
     */
    public static String[] listToArray(List<String> strings) {
        return strings.toArray(String[]::new);
    }

    /**
     * Converts an Integer List to an int array.
     */
    public static int[] integerListToArray(List<Integer> integers) {
        return integers.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
