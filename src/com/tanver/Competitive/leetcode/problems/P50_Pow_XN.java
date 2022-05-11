package com.tanver.Competitive.leetcode.problems;

public class P50_Pow_XN {

    public double myPow(double x, int n) {
        return Math.pow(x, n);
    }

    public static void main(String[] args) {
        P50_Pow_XN obj = new P50_Pow_XN();
        System.out.println(obj.myPow(2.0, -2));
    }
}
