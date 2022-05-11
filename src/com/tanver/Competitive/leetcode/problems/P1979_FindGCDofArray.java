package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;
import java.util.Scanner;

public class P1979_FindGCDofArray {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int b = nums[0];
        int a = nums[nums.length - 1];
        while (a != b) {
            if (b == 0)
                break;
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }

    public static void main(String[] args) {
        int [] arr = {3,3};
        System.out.println(new P1979_FindGCDofArray().findGCD(arr));
    }
}
