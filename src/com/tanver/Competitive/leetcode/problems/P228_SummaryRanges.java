package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class P228_SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int count = 0;
        StringBuilder temp = new StringBuilder(String.valueOf(nums[0]));
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i - 1] + 1) == nums[i]) {
                ++count;
            } else {
                if (count != 0)
                    temp.append("->").append(nums[i - 1]);
                list.add(temp.toString());
                count = 0;
                temp = new StringBuilder(String.valueOf(nums[i]));
            }
        }
        if ((nums[nums.length - 2] + 1) == nums[nums.length - 1]) {
            temp.append("->");
            temp.append(nums[nums.length - 1]);
            list.add(String.valueOf(temp));
        } else
            list.add(String.valueOf(temp));
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new P228_SummaryRanges()
                .summaryRanges(new int[]{0, 1, 2, 4, 5, 7, 8, 9, 11, 12, 13, 15}));
    }

}
