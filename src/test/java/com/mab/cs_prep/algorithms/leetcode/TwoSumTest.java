package com.mab.cs_prep.algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TwoSumTest {

    private TwoSum twoSum;

    @BeforeEach
    void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    void getTwoSumValues1() {
        //given
        int[] input = {2,7,11,15};
        int target = 9;

        //when
        int[] res = twoSum.getTwoSumValuesImproved(input, target);

        //then
        System.out.println(Arrays.toString(res));
    }

    @Test
    void getTwoSumValues2() {
        //given
        int[] input = {3,2,4};
        int target = 6;

        //when
        int[] res = twoSum.getTwoSumValuesImproved(input, target);

        //then
        System.out.println(Arrays.toString(res));
    }

    @Test
    void getTwoSumValues3() {
        //given
        int[] input = {3,3};
        int target = 6;

        //when
        int[] res = twoSum.getTwoSumValuesImproved(input, target);

        //then
        System.out.println(Arrays.toString(res));
    }
}