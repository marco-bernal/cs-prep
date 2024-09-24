package com.mab.cs_prep.algorithms.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciTest {

    private Fibonacci fibonacci;

    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    void shouldReturnFibonacciSumForAGivenNumber() {
        //given
        int number = 9;

        //when
        int result = fibonacci.getFibonacci(number);

        //then
        assertThat(result).isEqualTo(34);
    }

    @Test
    void linearTimeExample() {
        //given
        int[] values = {2, 4, 5, 7, 5, 3, 7, 8, 6};

        //when

        //then
        Arrays.stream(values)
                .forEach(System.out::println);
    }

    @Test
    void whatever() {
        //given
        List<Integer> values = new ArrayList<>();

        //when
        values.add(40);
        values.add(48);
        values.add(64);
        values.add(45);
        values.add(34);

        //then
        values.stream()
                .filter(v -> v > 50)
                .map(Float::new)
                .forEach(System.out::println);
    }

}
