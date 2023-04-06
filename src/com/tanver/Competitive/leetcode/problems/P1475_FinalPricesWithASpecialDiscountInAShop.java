package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;
import java.util.Stack;

public class P1475_FinalPricesWithASpecialDiscountInAShop {

    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i])
                prices[stack.pop()] -= prices[i];
            stack.push(i);
        }
        return prices;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(new P1475_FinalPricesWithASpecialDiscountInAShop()
                .finalPrices(new int[]{8, 4, 6, 2, 3})));


    }

}
