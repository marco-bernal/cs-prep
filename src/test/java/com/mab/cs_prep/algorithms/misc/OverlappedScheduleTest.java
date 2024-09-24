package com.mab.cs_prep.algorithms.misc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OverlappedScheduleTest {

    private OverlappedSchedule schedule;

    @BeforeEach
    void setUp() {
        schedule = new OverlappedSchedule();
    }

    @Test
    void shouldGetResultWhenScheduleOverlaps() {
        //given
        int[] interval1 = {1, 4};
        int[] interval2 = {2, 6};

        //when
        int[] result = schedule.getInterval(interval1, interval2);

        //then
        assertThat(result[0]).isEqualTo(interval1[0]);
        assertThat(result[1]).isEqualTo(interval2[1]);
    }
}
