package com.tanver.Competitive.gfg.practice;

import com.tanver.Competitive.gfg.Main;

public class KadanesAlgorithm {

    long maxSubarraySum(int[] arr, int n) {
        // Your code here
        long sum = 0;
        long max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > max)
                max = sum;
            if (sum < 0)
                sum = 0;
        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println(new KadanesAlgorithm().maxSubarraySum(new int[]{1, 2, 3, -2, 5}, 5));
    }

}
