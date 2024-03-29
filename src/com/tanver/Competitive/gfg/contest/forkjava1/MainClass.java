package com.tanver.Competitive.gfg.contest.forkjava1;

import java.util.Arrays;

public class MainClass {
    public int maximumProduct(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int max1 = nums[len - 1] * nums[len - 2] * nums[len - 3];
        int max2 = nums[0] * nums[1] * nums[len - 1];
        return Math.max(max1, max2);
    }

    public static void main(String[] args) {
        System.out.println(new MainClass().maximumProduct(new int[]{
                -100, -98, -1, 2, 3, 4
        }));
    }

}