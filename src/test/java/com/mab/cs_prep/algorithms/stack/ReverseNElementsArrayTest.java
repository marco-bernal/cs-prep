package com.mab.cs_prep.algorithms.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseNElementsArrayTest {

    private ReverseNElementsArray reverseNElementsArray;

    @BeforeEach
    void setUp() {
        reverseNElementsArray = new ReverseNElementsArray();
    }

    @Test
    void getReversedArray() {
        //given
        int[] input = {1, 2, 3, 4, 5};
        int target = 3;

        //when
        int[] result = reverseNElementsArray.getReversedArray(input, target);

        //then
        assertThat(result).containsExactly(3, 2, 1, 4, 5);
    }
}