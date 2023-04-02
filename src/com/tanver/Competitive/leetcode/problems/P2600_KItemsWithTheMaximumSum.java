package com.tanver.Competitive.leetcode.problems;

public class P2600_KItemsWithTheMaximumSum {

    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = 0;
        if (numOnes < k) {
            sum += numOnes;
            k -= numOnes;
        } else
            return sum + k;
        if (numZeros < k)
            k -= numZeros;
        else
            return sum;
        return sum - k;
    }

    public static void main(String[] args) {
        System.out.println(new P2600_KItemsWithTheMaximumSum()
                .kItemsWithMaximumSum(3, 2, 1, 4));
    }

}
