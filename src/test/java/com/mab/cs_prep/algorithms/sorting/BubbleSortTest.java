package com.mab.cs_prep.algorithms.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BubbleSortTest {

    private BubbleSort bubbleSort;

    @BeforeEach
    void setUp() {
        bubbleSort = new BubbleSort();
    }

    @Test
    void shouldSortAnUnsortedArrayUsingBubbleSortAlgorithm() {
        //given
        int[] input = {7, 20, 15, 8, 6, 9, 33, 104, 29};
        int[] output = {6, 7, 8, 9, 15, 20, 29, 33, 104};

        //when
        int[] sortedArray = bubbleSort.getSortedArray(input);

        //then
        assertThat(sortedArray).containsExactly(output);
    }
}
