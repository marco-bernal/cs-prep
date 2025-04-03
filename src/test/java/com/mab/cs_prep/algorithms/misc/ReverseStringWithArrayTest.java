package com.mab.cs_prep.algorithms.misc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseStringWithArrayTest {

    private ReverseStringWithArray reverseStringWithArray;

    @BeforeEach
    void setUp() {
        reverseStringWithArray = new ReverseStringWithArray();
    }

    @Test
    void shouldReverseAGivenString() {
        //given
        String input = "whatever";

        //when
        String output = reverseStringWithArray.reverseString(input);

        //then
        assertThat(output).isEqualTo("revetahw");
    }
}
