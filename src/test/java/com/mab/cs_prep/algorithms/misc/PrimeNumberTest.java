package com.mab.cs_prep.algorithms.misc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PrimeNumberTest {

    private PrimeNumber primeNumber;

    @BeforeEach
    void setUp() {
        primeNumber = new PrimeNumber();
    }

    @Test
    void shouldVaidateAPrimeNumberWhenItsTrue() {
        //given
        int number = 5;

        //when
        boolean result = primeNumber.isPrime(number);

        //then
        assertThat(result).isTrue();
    }

    @Test
    void shouldVaidateAPrimeNumberWhenItsFalse() {
        //given
        int number = 10;

        //when
        boolean result = primeNumber.isPrime(number);

        //then
        assertThat(result).isFalse();
    }
}
