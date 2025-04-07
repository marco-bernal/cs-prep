package com.mab.cs_prep.algorithms.misc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestConsecutiveSequenceTest {

    private LongestConsecutiveSequence lcs;

    @BeforeEach
    void setUp() {
        lcs = new LongestConsecutiveSequence();
    }

    @Test
    void getLCS_firstCase() {
        //given
        int[] input = new int[] {6, 7, 3, 1, 100, 102, 6, 12};

        //when
        int result = lcs.getLCS(input);

        //then
        assertThat(result).isEqualTo(2);
    }

    @Test
    void getLCS_secondCase() {
        //given
        int[] input = new int[] {5, 6, 1, 2, 8, 9, 7};

        //when
        int result = lcs.getLCS(input);

        //then
        assertThat(result).isEqualTo(5);
    }

    @Test
    void getLCS_thirdCase() {
        //given
        int[] input = new int[] {4, 3, 8, 1, 2, 6, 100, 9};

        //when
        int result = lcs.getLCS(input);

        //then
        assertThat(result).isEqualTo(4);
    }

    @Test
    void getLCSOptimal_firstCase() {
        //given
        int[] input = new int[] {6, 7, 3, 1, 100, 102, 6, 12};

        //when
        int result = lcs.getLCSOptimal(input);

        //then
        assertThat(result).isEqualTo(2);
    }
    @Test
    void getLCSOptimal_secondCase() {
        //given
        int[] input = new int[] {5, 6, 1, 2, 8, 9, 7};

        //when
        int result = lcs.getLCSOptimal(input);

        //then
        assertThat(result).isEqualTo(5);
    }

    @Test
    void getLCSOptimal_thirdCase() {
        //given
        int[] input = new int[] {4, 3, 8, 1, 2, 6, 100, 9};

        //when
        int result = lcs.getLCSOptimal(input);

        //then
        assertThat(result).isEqualTo(4);
    }
}