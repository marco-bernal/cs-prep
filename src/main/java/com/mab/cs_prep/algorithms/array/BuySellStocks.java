package com.mab.cs_prep.algorithms.array;

/**
 * Buy & Sell Stocks
 * Problem: You are given an array where prices[i] is the price of a given stock on day i.
 * You want to maximize your profit by choosing a day to buy the stock and a different day to sell it.
 * Return the maximum profit you can achieve from this transaction. If no profit can be made, return 0.
 *
 * Rules:
 * You may only buy and sell once.
 * You cannot sell before you buy.
 *
 * Input:
 * prices: An array of integers representing the stock price on each day.
 *
 * Output:
 * Return an integer representing the maximum profit.
 *
 * Test Cases:
 * Input: prices = [7, 1, 5, 3, 6, 4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6). Profit = 6 - 1 = 5.
 *
 * Input: prices = [7, 6, 4, 3, 1]
 * Output: 0
 * Explanation: No profit can be made as prices continually decrease.
 *
 * Input: prices = [3, 9, 6, 7, 2]
 * Output: 6
 * Explanation: Buy on day 1 (price = 3) and sell on day 2 (price = 8). Profit = 8 - 3 = 5.
 *
 * Input: prices = [1, 2, 3, 4, 5]
 * Output: 4
 * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5). Profit = 5 - 1 = 4.
 *
 * Input: prices = [5, 4, 3, 2, 10]
 * Output: 8
 * Explanation: Buy on day 4 (price = 2) and sell on day 5 (price = 10). Profit = 10 - 2 = 8.
 *
 * The goal of this exercise is to help you understand how to solve optimization problems efficiently by finding
 * the best time to buy and sell stocks in order to maximize profit.
 * You'll apply your understanding of arrays and implement an algorithm that tracks both the minimum buy price
 * and maximum potential profit.
 */
public class BuySellStocks {

    public int getProfit(int[] prices) {

        int priceBuy = 0;
        int dayBuy = 0;

        // Finds the day to buy.
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i+1]) {
                priceBuy = prices[i];
                dayBuy = i;
                break;
            }
        }

        // Didn't find a price to buy. Means that once can't sell.
        if (priceBuy == 0) {
            return 0;
        }

        int priceSell = 0;
        int daySell = 0;

        //finds the day to sell if any, starting after the day of buying.
        priceSell = prices[dayBuy];

        for (int i = dayBuy; i < prices.length; i++) {
            if (prices[i] > priceSell) {
              priceSell = prices[i];
              daySell = i;
            }
        }

        if (daySell != 0) {
            return priceSell - priceBuy;
        }

        // if one didn't sell, there's no profit.
        return 0;
    }

    /**
     * Iterate through the prices array.
     * If the current price is less than the minimum, update the minimum.
     * If the difference between the current price and the minimum price is greater than the current maximum profit,
     * update the profit.
     *
     * @param prices stock prices array.
     * @return total profit.
     */
    public int getProfitImproved(int[] prices) {
        if (prices.length < 2) return 0;

        int minPrice = Integer.MAX_VALUE; // initialize random value for min price.
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) { // Always to be true, at lest the first time.
                minPrice = price; // updates the minPrice value

            } else if (price - minPrice > maxProfit) { // Always to be true, at lest the first time.
                maxProfit = price - minPrice; // updates the profit
            }
        }

        return maxProfit;
    }
}
