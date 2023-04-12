package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class P830_PositionsOfLargeGroups {

    public List<List<Integer>> largeGroupPositions1(String s) {
        List<List<Integer>> result = new ArrayList<>();
        int counter = 1;
        int left = 0;
        int right = 1;
        while (right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                ++counter;
                ++right;
            } else {
                if (counter > 2) {
                    result.add(new ArrayList<>(List.of(left, right - 1)));
                }
                left = right++;
                counter = 1;
            }
        }
        if (counter > 2)
            result.add(new ArrayList<>(List.of(left, right - 1)));
        return result;
    }

    public List<List<Integer>> largeGroupPositions2(String s) {
        List<List<Integer>> list = new ArrayList<>();
        int start = 0;
        int end = 0;
        int count = 0;
        int i = 0;
        while (i < s.length()) {
            count = 1;
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                i++;
                count++;
            }
            if (count >= 3) {
                start = i + 1 - count;
                end = i;
                List<Integer> node = new ArrayList<>();
                node.add(start);
                node.add(end);
                list.add(node);
            }
            i++;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new P830_PositionsOfLargeGroups().
                largeGroupPositions2("abcdddeeeeaabbbcdaaa"));
    }

}
