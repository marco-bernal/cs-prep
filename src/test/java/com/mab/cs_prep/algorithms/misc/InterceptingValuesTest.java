package com.mab.cs_prep.algorithms.misc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InterceptingValuesTest {

    private InterceptingValues interceptingValues;

    @BeforeEach
    void setUp() {
        interceptingValues = new InterceptingValues();
    }

    @Test
    void shouldGetInterceptingValues() {
        //given
        int[] inputA = {2,7,5,15};
        int[] inputB = {3,8,99,7,15};

        //when
        int[] result = interceptingValues.getInterceptingValues(inputA, inputB);

        //then
        assertThat(result).contains(7, 15);
    }
}