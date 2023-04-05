package com.tanver.Competitive.leetcode.problems;

public class P2475_NumberOfUnequalTripletsInArray {

    public int unequalTriplets1(int[] nums) {
        int counter = 0;
        int len = nums.length;
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                if (nums[i] == nums[j])
                    continue;
                for (int k = j + 1; k < len; k++) {
                    if (nums[i] != nums[j] && nums[j] != nums[k] && nums[i] != nums[k])
                        ++counter;
                }
            }
        }
        return counter;
    }

    public int unequalTriplets2(int[] nums) {
        int[] count = new int[1001];
        for (int num : nums)
            count[num]++;
        int left = 0;
        int right = nums.length;
        int res = 0;
        for (int freq : count) {
            if (freq != 0) {
                right = right - freq;
                res += left * freq * right;
                left += freq;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new P2475_NumberOfUnequalTripletsInArray()
                .unequalTriplets1(new int[]{4, 4, 2, 4, 3}));
        System.out.println(new P2475_NumberOfUnequalTripletsInArray()
                .unequalTriplets1(new int[]{1, 1, 1, 1, 1}));

    }

}
