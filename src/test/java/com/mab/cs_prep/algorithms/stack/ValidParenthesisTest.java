package com.mab.cs_prep.algorithms.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ValidParenthesisTest {

    private ValidParenthesis validParenthesis;

    @BeforeEach
    void setUp() {
        validParenthesis = new ValidParenthesis();
    }

    @ParameterizedTest
    @MethodSource("getValidStrings")
    void isValidParenthesis_shouldReturnTrue(String input) {
        //when
        boolean result = validParenthesis.isValidParenthesis(input);

        //then
        assertThat(result).isTrue();
    }

    @ParameterizedTest
    @MethodSource("getInvalidStrings")
    void isValidParenthesis_shouldReturnFalse(String input) {
        //when
        boolean result = validParenthesis.isValidParenthesis(input);

        //then
        assertThat(result).isFalse();
    }

    private static Stream<Arguments> getValidStrings() {
        return Stream.of(
                Arguments.of("()"),
                Arguments.of("([])"),
                Arguments.of("(([]))"),
                Arguments.of("(([[]]))"),
                Arguments.of("(([{[()]}]))")
        );
    }

    private static Stream<Arguments> getInvalidStrings() {
        return Stream.of(
                Arguments.of("([)]"),
                Arguments.of("]"),
                Arguments.of(")}"),
                Arguments.of("({[})"),
                Arguments.of("{"),
                Arguments.of("(")
        );
    }
}