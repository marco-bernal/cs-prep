package com.mab.cs_prep.algorithms.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LinearSearchTest {

    private LinearSearch linearSearch;

    @BeforeEach
    void setUp() {
        linearSearch = new LinearSearch();
    }

    @Test
    void searchValue() {
        //given
        int[] input = {2, 4, 5, 7, 6, 132, 19, 30, 56, 0};
        int valueToSearch = 19;

        //when
        int result = linearSearch.searchValue(input, valueToSearch);

        //then
        assertThat(result).isEqualTo(6);
    }
}