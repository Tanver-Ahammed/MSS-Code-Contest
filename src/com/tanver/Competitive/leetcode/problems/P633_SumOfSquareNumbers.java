package com.tanver.Competitive.leetcode.problems;

public class P633_SumOfSquareNumbers {

    public boolean judgeSquareSum(int c) {
        long left = 0;
        long right = (long) Math.sqrt(c);
        while (left <= right) {
            long sqrtSum = left * left + right * right;
            if (sqrtSum == c) {
                return true;
            } else if (sqrtSum > c) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(new P633_SumOfSquareNumbers().judgeSquareSum(2147483600));
        System.out.println(new P633_SumOfSquareNumbers().judgeSquareSum(169));
//        System.out.println(new P633_SumOfSquareNumbers().judgeSquareSum(4));
    }

}
