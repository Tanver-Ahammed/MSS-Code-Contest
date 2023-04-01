package com.tanver.Competitive.leetcode.problems;

public class P2485_FindThePivotInteger {

    public int pivotInteger(int n) {
        int sum = n * (n + 1) / 2;
        int lastSum = 0;
        for (int i = n; i > 0; i--) {
            lastSum += i;
            if (lastSum == sum) {
                return i;
            }
            sum -= i;
        }
        return -1;
    }

    public static void main(String[] args) {

    }

}
