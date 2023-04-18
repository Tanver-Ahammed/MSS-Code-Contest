package com.tanver.Competitive.leetcode.problems;

public class P1822_SignOfTheProductOfAnArray {

    public int arraySign(int[] nums) {
        int prod = 1;
        for (int num : nums) {
            if (num == 0)
                return 0;
            else if(num > 0)
                prod *= 1;
            else
                prod *= -1;
        }
        return prod;
    }

    public static void main(String[] args) {

    }

}
