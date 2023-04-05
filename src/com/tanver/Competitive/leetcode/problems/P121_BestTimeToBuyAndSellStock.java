package com.tanver.Competitive.leetcode.problems;

public class P121_BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int max_profit = 0;
        while (sell < prices.length) {
            if (prices[buy] < prices[sell]) {
                int profit = prices[sell] - prices[buy]; // our current profit
                max_profit = Math.max(max_profit, profit);
            } else {
                buy = sell;
            }
            sell++;
        }
        return max_profit;
    }

    public static void main(String[] args) {

    }

}
