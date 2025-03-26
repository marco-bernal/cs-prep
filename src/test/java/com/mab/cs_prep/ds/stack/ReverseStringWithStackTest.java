package com.mab.cs_prep.ds.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseStringWithStackTest {

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
    void getReversedStringWithArrayDeque() {
        //given
        String name = "samoht";

        //when
        String result = reverseStringWithStack.getReversedStringWithArrayDeque(name);

        //then
        assertThat(result).isEqualTo("thomas");
    }
}