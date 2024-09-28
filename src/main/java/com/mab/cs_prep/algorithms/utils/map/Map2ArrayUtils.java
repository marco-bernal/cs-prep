package com.mab.cs_prep.algorithms.utils.map;

import lombok.experimental.UtilityClass;

import java.util.Map;

@UtilityClass
public class Map2ArrayUtils {

    /**
     * Converts a Map<String,Integer> to an Integer[] array.
     */
    public static Integer[] integerMapValuesToIntegerArray(Map<String,Integer> map) {
        return map.values()
                .toArray(Integer[]::new);
    }

    /**
     * Converts a Map<String,Integer> to an int[] array.
     */
    public static int[] integerMapValuesToIntArray(Map<String,Integer> map) {
        return map.values()
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
