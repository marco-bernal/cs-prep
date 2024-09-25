package com.mab.cs_prep.algorithms.misc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ProductExclusionTest {

    private ProductExclusion productExclusion;

    @BeforeEach
    void setUp() {
        productExclusion = new ProductExclusion();
    }

    @Test
    void getProduct() {
        //given
        int[] input = {2,3,4,5};

        //when
        int[] result = productExclusion.getProduct(input);

        //then
        assertThat(result).containsExactly(60, 40, 30, 24);
    }

    @Test
    void shouldReturnEmptyArray() {
        //given
        int[] input = {};

        //when
        int[] result = productExclusion.getProduct(input);

        //then
        assertThat(result).isEmpty();
    }


    @Test
    void shouldReturnOneElementArray() {
        //given
        int[] input = {6};

        //when
        int[] result = productExclusion.getProduct(input);

        //then
        assertThat(result).containsExactly(6);
    }

    @Test
    void getProductImproved() {
        //given
        int[] input = {2,3,4,5};

        //when
        int[] result = productExclusion.getProductImproved(input);

        //then
        assertThat(result).containsExactly(60, 40, 30, 24);
    }

}