package com.mab.cs_prep.algorithms.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindMinMaxTest {

    private FindMinMax findMinMax;

    @BeforeEach
    void setUp() {
        findMinMax = new FindMinMax();
    }

    @Test
    void findMinMaxValues() {
        //given
        int[] input = {1,4,6,5,7,8,9};

        //when
        int[] result = findMinMax.findMinMaxValues(input);

        //then
        assertThat(result).containsExactly(1,9);
    }

    @Test
    void findMinMaxValuesEnhanced() {
        //given
        int[] input = {1,4,6,5,7,8,9};

        //when
        int[] result = findMinMax.findMinMaxValuesEnhanced(input);

        //then
        assertThat(result).containsExactly(1,9);
    }
}