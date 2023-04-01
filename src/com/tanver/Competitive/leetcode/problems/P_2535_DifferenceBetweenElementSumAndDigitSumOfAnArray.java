package com.tanver.Competitive.leetcode.problems;

public class P_2535_DifferenceBetweenElementSumAndDigitSumOfAnArray {

    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for (int num : nums) {
            if (num > 9) {
                elementSum += num;
                digitSum += totalDigitSum(num);
            }
        }
        return Math.abs(elementSum - digitSum);
    }

    private int totalDigitSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

    }

}
