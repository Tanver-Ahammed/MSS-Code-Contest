package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P179_LargestNumber {

    public String largestNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            while (num != 0) {
                int digit = num % 10;
                list.add(digit);
                num /= 10;
            }
        }
        list.sort(Comparator.reverseOrder());
        StringBuilder result = new StringBuilder();
        for (Integer integer : list) result.append(integer);
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new P179_LargestNumber().largestNumber(new int[]{3, 30, 34, 5, 9}));
    }

}
