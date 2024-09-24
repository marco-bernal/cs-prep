package com.mab.cs_prep.algorithms.misc;

import com.mab.cs_prep.algorithms.model.Result;
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
        Result result;

        //when
        result = finder.getMaxAndMin(values);

        //then
        assertThat(result.getSmallest()).isEqualTo(0);
        assertThat(result.getGreatest()).isEqualTo(89);
    }

    @Test
    void shouldGetMaxAndminAsArray() {
        //given
        int[] values = {3, 6, 7, 9, 12, 65, 4, 89, 0, 2, 43};
        int[] result;

        //when
        result = finder.getMaxAndMinAsArray(values);

        assertThat(result[0]).isEqualTo(89);
        assertThat(result[1]).isEqualTo(0);

    }
}
