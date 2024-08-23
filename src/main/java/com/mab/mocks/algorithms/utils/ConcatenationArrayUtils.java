package com.mab.mocks.algorithms.utils;

import lombok.experimental.UtilityClass;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * This class shows effective ways to do common arrays concatenation tasks.
 * Using the Collections Framework, Streams, Lambda, and/or Method references.
 */
@UtilityClass
public class ConcatenationArrayUtils {

    /**
     * Concatenate 2 String[] arrays.
     */
    public static String[] concatenateStringArrays(String[] input1, String[] input2) {
        return Stream.concat(Arrays.stream(input1), Arrays.stream(input2))
                .toArray(String[]::new);
    }

    /**
     * Concatenate 2 int[] arrays.
     */
    public static int[] concatenateIntArrays(int[] input1, int[] input2) {
        return IntStream.concat(Arrays.stream(input1), Arrays.stream(input2))
                .toArray();
    }

    /**
     * Concatenate n String[] arrays.
     */
    public static String[] concatenateStringArrays(String[] ...arrays) {
        return Stream.of(arrays)
                .flatMap(Arrays::stream)
                .toArray(String[]::new);
    }

    /**
     * Concatenate n int[] arrays.
     */
    public static int[] concatenateStringArrays(int[] ...arrays) {
        return Stream.of(arrays)
                .flatMapToInt(Arrays::stream)
                .toArray();
    }
}
