package com.mab.cs_prep.algorithms.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTest {

    private BinarySearch binarySearch;

    @BeforeEach
    void setUp() {
        binarySearch = new BinarySearch();
    }

    @Test
    void shouldFindAnElementByUsingBinarySearchWhenTheValueIsGreaterThanTheMiddle() {
        //given
        int[] sortedArray = {7, 20, 31, 54, 69, 81, 100};

        //where
        int position = binarySearch.binarySearch(81, sortedArray);

        //then
        assertThat(position).isEqualTo(5);
    }

    @Test
    void shouldFindAnElementByUsingBinarySearchWhenTheValueIsLesserThanTheMiddle() {
        //given
        int[] sortedArray = {7, 20, 31, 54, 69, 81, 100};

        //where
        int position = binarySearch.binarySearch(20, sortedArray);

        //then
        assertThat(position).isEqualTo(1);
    }

    @Test
    void shouldFindAnElementByUsingBinarySearchWhenTheValueIsInTheMiddle() {
        //given
        int[] sortedArray = {7, 20, 31, 54, 69, 81, 100};

        //where
        int position = binarySearch.binarySearch(54, sortedArray);

        //then
        assertThat(position).isEqualTo(3);
    }

}
