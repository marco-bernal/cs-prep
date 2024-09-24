package com.mab.cs_prep.algorithms.misc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class BalancedArrayTest {

    private BalancedArray balancedArray;

    @BeforeEach
    void setUp() {
        balancedArray = new BalancedArray();
    }


    @Test
    void shouldGetTwoBalancedLists() {
        //given
        int[] numbers = IntStream.of(3, 7, 0, 1, 4, 3, 8, 10, 9, 7, 6, 3, 2).toArray();

        //when
        List<int[]> result = balancedArray.getBalancedArrays(numbers);

        //then
        for(int[] a : result) {
            for (int i : a) {
                System.out.print(i + ", ");
            }
            System.out.println();
        }

        assertThat(result.get(0))
                .containsExactly(3, 7, 0, 1, 4, 3, 8, 3, 2);

        assertThat(result.get(1))
                .containsExactly(10, 9, 7, 6);
    }
}
