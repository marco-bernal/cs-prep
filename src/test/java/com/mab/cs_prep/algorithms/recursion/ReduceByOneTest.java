package com.mab.cs_prep.algorithms.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReduceByOneTest {

    private ReduceByOne reduceByOne;

    @BeforeEach
    void setUp() {
        reduceByOne = new ReduceByOne();
    }

    @Test
    void reduceByOne() {
        //given
        int number = 5;

        //when
        reduceByOne.reduceByOne(number);
    }
}