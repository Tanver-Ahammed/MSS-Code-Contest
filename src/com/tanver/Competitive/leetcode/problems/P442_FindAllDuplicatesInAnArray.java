package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class P442_FindAllDuplicatesInAnArray {

    public List<Integer> findDuplicates(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len + 1];
        List<Integer> list = new ArrayList<>();
        int max = 0;
        for (int num : nums)
            arr[num]++;
        for (int i = 1; i <= len; i++) {
            if (arr[i] == 2)
                list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new P442_FindAllDuplicatesInAnArray().findDuplicates(new int[]
                {4, 3, 2, 7, 8, 2, 3, 1}));
    }

}
