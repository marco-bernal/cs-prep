package com.mab.mocks.algorithms.misc;

import com.mab.mocks.algorithms.model.BalancedResult;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        BalancedResult result;

        //when
        result = balancedArray.getBalancedArrays(numbers);
        System.out.println(result);

        //then
        assertThat(result.getLeftList())
                .extracting(Integer::intValue)
                .containsExactly(3, 7, 0, 1, 4, 3, 8, 3, 2);

        assertThat(result.getRightList())
                .extracting(Integer::intValue)
                .containsExactly(10, 9, 7, 6);
    }
}
