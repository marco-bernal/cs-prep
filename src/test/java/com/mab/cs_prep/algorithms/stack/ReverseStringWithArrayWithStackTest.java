package com.mab.cs_prep.algorithms.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseStringWithArrayWithStackTest {

    private ReverseStringWithStack reverseStringWithStack;

    @BeforeEach
    void setUp() {
        reverseStringWithStack = new ReverseStringWithStack();
    }

    @Test
    void getReversedStringWithBareStack() {
        //given
        String name = "samoht";

        //when
        String result = reverseStringWithStack.getReversedStringWithBareStack(name);

        //then
        assertThat(result).isEqualTo("thomas");
    }

    @Test
    void getReversedStringWithArrayDequeAndStringBuilder() {
        //given
        String name = "samoht";

        //when
        String result = reverseStringWithStack.getReversedStringWithArrayDequeAndStringBuilder(name);

        //then
        assertThat(result).isEqualTo("thomas");
    }

    @Test
    void getReversedStringWithArrayDequeAndCharArray() {
        //given
        String name = "samoht";

        //when
        String result = reverseStringWithStack.getReversedStringWithArrayDequeAndCharArray(name);

        //then
        assertThat(result).isEqualTo("thomas");
    }
}