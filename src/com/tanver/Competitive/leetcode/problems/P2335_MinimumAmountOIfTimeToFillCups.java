package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P2335_MinimumAmountOIfTimeToFillCups {

    public int fillCups1(int[] amount) {
        int secondCounter = 0;
        Arrays.sort(amount);
        while (amount[2] > 0 && amount[1] > 0) {
            secondCounter++;
            amount[2]--;
            amount[1]--;
            Arrays.sort(amount);
        }
        return secondCounter + amount[2];
    }

    public int fillCups2(int[] amount) {
        int sum = amount[0] + amount[1] + amount[2];
        int max = Math.max(Math.max(amount[0], amount[1]), amount[2]);
        return Math.max(max, (sum + 1) / 2);
    }

    public static void main(String[] args) {

    }

}
