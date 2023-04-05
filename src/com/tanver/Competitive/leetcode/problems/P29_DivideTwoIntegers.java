package com.tanver.Competitive.leetcode.problems;

public class P29_DivideTwoIntegers {

    public int divide(int dividend, int divisor) {
        if (divisor == 0)
            return 0;
        else if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        return dividend / divisor;
    }

    public static void main(String[] args) {
        System.out.println(new P29_DivideTwoIntegers().divide(-2147483648, -1));
        System.out.println(new P29_DivideTwoIntegers().divide(10, 3));
        System.out.println(new P29_DivideTwoIntegers().divide(7, -3));
    }

}
