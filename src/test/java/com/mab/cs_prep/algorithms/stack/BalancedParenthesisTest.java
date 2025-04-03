package com.mab.cs_prep.algorithms.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class BalancedParenthesisTest {

    private BalancedParenthesis balancedParenthesis;

    @BeforeEach
    void setUp() {
        balancedParenthesis = new BalancedParenthesis();
    }

    @ParameterizedTest
    @MethodSource("getValidStrings")
    void isBalancedParenthesis_ShouldReturnTrue(String input) {
        //given
        boolean result = balancedParenthesis.isBalancedParenthesis(input);

        //when
        assertThat(result).isTrue();
    }

    @ParameterizedTest
    @MethodSource("getInvalidStrings")
    void isBalancedParenthesis_ShouldReturnFalse(String input) {
        //given
        boolean result = balancedParenthesis.isBalancedParenthesis(input);

        //when
        assertThat(result).isFalse();
    }

    private static Stream<Arguments> getValidStrings() {
        return Stream.of(
            Arguments.of("()"),
                Arguments.of("()()"),
                Arguments.of("(())"),
                Arguments.of("()()()"),
                Arguments.of("(()())")
        );
    }

    private static Stream<Arguments> getInvalidStrings() {
        return Stream.of(
                Arguments.of("(()"),
                Arguments.of(")()("),
                Arguments.of(")("),
                Arguments.of("))"),
                Arguments.of(")"),
                Arguments.of("(")
        );
    }
}