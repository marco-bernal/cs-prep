package com.mab.cs_prep.algorithms.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseNElementsTest {

    private ReverseNElements reverseNElements;

    @BeforeEach
    void setUp() {
        reverseNElements = new ReverseNElements();
    }

    @Test
    void getReversedArray() {
        //given
        int[] input = {1, 2, 3, 4, 5};
        int target = 3;

        //when
        int[] result = reverseNElements.getReversedArray(input, target);

        //then
        assertThat(result).containsExactly(3, 2, 1, 4, 5);
    }
}