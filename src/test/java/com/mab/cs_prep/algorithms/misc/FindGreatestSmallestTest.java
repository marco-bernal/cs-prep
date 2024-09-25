package com.mab.cs_prep.algorithms.misc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindGreatestSmallestTest {

    private FindGreatestSmallest finder;

    @BeforeEach
    void setUp() {
        finder = new FindGreatestSmallest();
    }

    @Test
    void shouldFindSmallestAndGreatestValues() {
        //given
        int[] values = {3, 6, 7, 9, 12, 65, 4, 89, 0, 2, 43};

        //when
        int[] result = finder.getMaxAndMin(values);

        //then
        assertThat(result[0]).isEqualTo(0);
        assertThat(result[1]).isEqualTo(89);
    }

    @Test
    void shouldGetMaxAdminAsArray() {
        //given
        int[] values = {3, 6, 7, 9, 12, 65, 4, 89, 0, 2, 43};
        int[] result;

        //when
        result = finder.getMaxAndMinAsArray(values);

        assertThat(result[0]).isEqualTo(89);
        assertThat(result[1]).isEqualTo(0);
    }
}
