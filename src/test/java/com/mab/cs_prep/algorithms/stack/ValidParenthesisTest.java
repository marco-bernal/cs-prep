package com.mab.cs_prep.algorithms.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidParenthesisTest {

    private ValidParenthesis validParenthesis;

    @BeforeEach
    void setUp() {
        validParenthesis = new ValidParenthesis();
    }

    @Test
    void isValidParenthesis_firstCase() {
        //given
        String input = "(([]))";

        //when
        boolean result = validParenthesis.isValidParenthesis(input);

        //then
        assertThat(result).isTrue();
    }

    @Test
    void isValidParenthesis_secondCase() {
        //given
        String input = "[";

        //when
        boolean result = validParenthesis.isValidParenthesis(input);

        //then
        assertThat(result).isFalse();
    }
}