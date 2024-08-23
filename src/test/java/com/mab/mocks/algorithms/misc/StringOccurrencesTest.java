package com.mab.mocks.algorithms.misc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class StringOccurrencesTest {

    private StringOccurrences stringOccurrences;

    @BeforeEach
    void setUp() {
        stringOccurrences = new StringOccurrences();
    }

    @Test
    void getOccurrencesBruteForce() {
        //given
        String[] strings = {"ab", "ab", "abc"};
        String[] queries = {"ab", "abc", "bc"};

        //when
        int[] result = stringOccurrences.getOccurrencesBruteForce(strings, queries);

        //then
        System.out.println(Arrays.toString(result));

    }

    @Test
    void getOccurrencesImproved() {
        //given
        String[] strings = {"ab", "ab", "abc"};
        String[] queries = {"ab", "abc", "bc"};

        //when
        int[] result = stringOccurrences.getOccurrencesImprovedSolution(strings, queries);

        //then
        System.out.println(Arrays.toString(result));
        assertThat(result).containsExactly(2,1,0);

    }

    @Test
    void getOccurrencesOptimal() {
        //given
        String[] strings = {"ab", "ab", "abc"};
        String[] queries = {"ab", "abc", "bc"};

        //when
        List<Integer> result = stringOccurrences.getOccurrencesOptimal(strings, queries);

        //then
        assertThat(result).containsExactly(2,1,0);

    }
}