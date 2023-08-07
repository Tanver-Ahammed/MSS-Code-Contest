package com.tanver.Competitive.ostad.app;

public class BestTimeToBuyAndSellStock {

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
        System.out.println(new BestTimeToBuyAndSellStock().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
