package com.tanver.Competitive.leetcode.problems;

public class P2614_PrimeInDiagonal {

    public int diagonalPrime(int[][] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i][i]))
                max = Math.max(max, nums[i][i]);
            if (isPrime(nums[i][nums.length - i - 1]))
                max = Math.max(max, nums[i][nums.length - i - 1]);
        }
        return max;
    }

    private boolean isPrime(int num) {
        if (num == 1)
            return false;
        if (num == 2 || num == 3)
            return true;
        if (num % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new P2614_PrimeInDiagonal().diagonalPrime(
                new int[][]{{1, 2, 3}, {5, 6, 7}, {9, 10, 991}}
        ));
    }

}
