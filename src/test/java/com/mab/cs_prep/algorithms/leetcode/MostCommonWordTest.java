package com.mab.cs_prep.algorithms.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MostCommonWordTest {

    private MostCommonWord mcw;

    @BeforeEach
    void setUp() {
        mcw = new MostCommonWord();
    }

    @Test
    void shouldGetMostCommonWord() {
        //given
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit", "sun", "hummus", "hoe"};

        //when
        String mostCommonWord = mcw.getMostCommonWord(paragraph, banned);

        //then
        assertThat(mostCommonWord).isEqualTo("ball");
    }
}