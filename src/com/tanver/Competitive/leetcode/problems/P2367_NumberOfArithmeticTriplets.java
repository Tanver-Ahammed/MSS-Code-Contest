package com.tanver.Competitive.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class P2367_NumberOfArithmeticTriplets {

    public int arithmeticTriplets1(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();
        int len = nums.length;
        int counter = 0;
        // nums = [0,1,4,6,7,10], diff = 3
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                for (int k = j + 1; k < len; k++) {
                    if (nums[k] - nums[j] == diff && nums[j] - nums[i] == diff)
                        ++counter;
                }
            }
        }
        return counter;
    }

    public int arithmeticTriplets2(int[] nums, int diff) {
        int len = nums.length;
        int counter = 0;
        // nums = [0,1,4,6,7,10], diff = 3
        for (int i = 0; i < len - 2; i++) {
            int j = i + 1;
            int k = len - 1;
            while (j < k) {
                if (nums[j] - nums[i] < diff)
                    ++j;
                else if (nums[j] - nums[i] > diff) {
                    ++i;
                    j = i + 1;
                    k = len - 1;
                } else {
                    if (nums[k] - nums[j] > diff)
                        --k;
                    else if (nums[k] - nums[j] < diff) {
                        ++i;
                        j = i + 1;
                        k = len - 1;
                    } else {
                        ++counter;
                        ++i;
                        j = i + 1;
                        k = len - 1;
                    }
                }
            }
        }
        return counter;
    }

    public int arithmeticTriplets3(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();
        int i = 0, k = 1, result = 0;

        for(int num : nums)
            set.add(num);

        while(k < nums.length) {
            if(nums[k] - nums[i] == 2 * diff && set.contains(diff + nums[i]))
                ++result;
            if(nums[k] - nums[i] < 2 * diff)
                ++k;
            else
                ++i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new P2367_NumberOfArithmeticTriplets()
                .arithmeticTriplets1(new int[]{0, 1, 4, 5, 7, 10}, 3));
        System.out.println(new P2367_NumberOfArithmeticTriplets()
                .arithmeticTriplets2(new int[]{0, 1, 4, 5, 7, 10}, 3));
        System.out.println(new P2367_NumberOfArithmeticTriplets()
                .arithmeticTriplets1(new int[]{0, 1, 3, 4, 5, 6, 7, 10}, 3));
        System.out.println(new P2367_NumberOfArithmeticTriplets()
                .arithmeticTriplets2(new int[]{0, 1, 3, 4, 5, 6, 7, 10}, 3));
    }

}
