package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P2149_RearrangeArrayElementsBySign {

    public int[] rearrangeArray1(int[] nums) {
        int[] even = new int[nums.length / 2];
        int[] odd = new int[nums.length / 2];
        int evenIndex = 0;
        int oddIndex = 0;
        for (int num : nums) {
            if (num > 0)
                even[evenIndex++] = num;
            else
                odd[oddIndex++] = num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0)
                nums[i] = even[i / 2];
            else
                nums[i] = odd[i / 2];
        }
        return nums;
    }

    public int[] rearrangeArray2(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = 1;
        for (int num : nums) {
            if (num > 0) {
                result[evenIndex] = num;
                evenIndex += 2;
            } else {
                result[oddIndex] = num;
                oddIndex += 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new P2149_RearrangeArrayElementsBySign()
                .rearrangeArray1(new int[]{3, 1, -2, -5, 2, -4})));
        System.out.println(Arrays.toString(new P2149_RearrangeArrayElementsBySign()
                .rearrangeArray2(new int[]{3, 1, -2, -5, 2, -4})));
    }

}
