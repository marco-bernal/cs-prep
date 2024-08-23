package com.mab.mocks.algorithms.misc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseStringTest {

    private ReverseString reverseString;

    @BeforeEach
    void setUp() {
        reverseString = new ReverseString();
    }

    @Test
    void shouldReverseAGivenString() {
        //given
        String input = "whatever";

        //when
        String output = reverseString.reverseString(input);

        //then
        assertThat(output).isEqualTo("revetahw");
    }
}
