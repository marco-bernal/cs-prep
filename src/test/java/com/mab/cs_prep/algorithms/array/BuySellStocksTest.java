package com.mab.cs_prep.algorithms.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BuySellStocksTest {

    private BuySellStocks buySellStocks;

    @BeforeEach
    void setUp() {
        buySellStocks = new BuySellStocks();
    }

    @Test
    void getProfit_firstCase() {
        //given
        int[] prices = {7, 1, 5, 3, 6, 4};

        //when
        int profit = buySellStocks.getProfit(prices);

        //then
        assertThat(profit).isEqualTo(5);
    }

    @Test
    void getProfit_secondCase() {
        //given []
        int[] prices = {7, 6, 4, 3, 1};

        //when
        int profit = buySellStocks.getProfit(prices);

        //then
        assertThat(profit).isEqualTo(0);
    }

    @Test
    void getProfit_thirdCase() {
        //given []
        int[] prices = {3, 9, 6, 7, 2};

        //when
        int profit = buySellStocks.getProfit(prices);

        //then
        assertThat(profit).isEqualTo(6);
    }

    @Test
    void getProfit_fourthCase() {
        //given []
        int[] prices = {1, 2, 3, 4, 5};

        //when
        int profit = buySellStocks.getProfit(prices);

        //then
        assertThat(profit).isEqualTo(4);
    }

    @Test
    void getProfit_fifthCase() {
        //given []
        int[] prices = {5, 4, 3, 2, 10};

        //when
        int profit = buySellStocks.getProfit(prices);

        //then
        assertThat(profit).isEqualTo(8);
    }

    @Test
    void getProfitImproved_firstCase() {
        //given
        int[] prices = {7, 1, 5, 3, 6, 4};

        //when
        int profit = buySellStocks.getProfitImproved(prices);

        //then
        assertThat(profit).isEqualTo(5);
    }

    @Test
    void getProfitImproved_secondCase() {
        //given []
        int[] prices = {7, 6, 4, 3, 1};

        //when
        int profit = buySellStocks.getProfitImproved(prices);

        //then
        assertThat(profit).isEqualTo(0);
    }
}