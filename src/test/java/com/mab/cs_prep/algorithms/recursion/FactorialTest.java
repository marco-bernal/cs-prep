package com.mab.cs_prep.algorithms.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {

    private Factorial factorial;

    @BeforeEach
    void setUp() {
        factorial = new Factorial();
    }

    @Test
    void shouldGetFactorialForAGivenNumber() {
        //given
        int number = 5;

        //when
        int result = factorial.getFactorial(number);

        //then
        assertThat(result).isEqualTo(120);
    }

}
