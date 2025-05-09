package com.mab.cs_prep.algorithms.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RecursiveBinarySearchTest {

    private RecursiveBinarySearch rbs;

    @BeforeEach
    void setUp() {
        rbs = new RecursiveBinarySearch();
    }

    @Test
    void recursiveBinarySearchBiggerThanTheMiddlePoint() {
        //given
        int[] sortedArray = {7, 20, 31, 54, 69, 81, 100};
        int middle = sortedArray.length / 2;

        //where
        int position = rbs.recursiveBinarySearch(sortedArray, 81, 0, middle);

        //then
        assertThat(position).isEqualTo(5);
    }

    @Test
    void recursiveBinarySearchSmallerThanTheMiddlePoint() {
        //given
        int[] sortedArray = {7, 20, 31, 54, 69, 81, 100};
        int middle = sortedArray.length / 2;

        //where
        int position = rbs.recursiveBinarySearch(sortedArray, 20, 0, middle);

        //then
        assertThat(position).isEqualTo(1);
    }

    @Test
    void recursiveBinarySearchEqualsThanTheMiddlePoint() {
        //given
        int[] sortedArray = {7, 20, 31, 54, 69, 81, 100};
        int middle = sortedArray.length / 2;

        //where
        int position = rbs.recursiveBinarySearch(sortedArray, 54, 0, middle);

        //then
        assertThat(position).isEqualTo(3);
    }

    @Test
    void shouldReturnNegativeOneWhenNotFound() {
        //given
        int[] sortedArray = {7, 20, 31, 54, 69, 81, 100};
        int middle = sortedArray.length / 2;

        //where
        int position = rbs.recursiveBinarySearch(sortedArray, 7361, 0, middle);

        //then
        assertThat(position).isEqualTo(-1);
    }
}