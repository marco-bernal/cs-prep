package com.mab.cs_prep.algorithms.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RecursiveLinearSearchTest {

    private RecursiveLinearSearch rls;

    @BeforeEach
    void setUp() {
        rls = new RecursiveLinearSearch();
    }

    @Test
    void recursiveLinearSearch() {
        //given
        int[] input = {81, 100, 7, 20, 54, 31, 69, 99, 45, 29};

        //when
        int result = rls.recursiveLinearSearch(input, 0, 69);

        //then
        assertThat(result).isEqualTo(6);
    }
}