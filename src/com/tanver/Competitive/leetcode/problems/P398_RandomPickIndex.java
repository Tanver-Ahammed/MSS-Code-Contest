package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class P398_RandomPickIndex {

    int[] arr;

    public P398_RandomPickIndex(int[] nums) {
        arr = nums;
    }

    public int pick(int target) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                list.add(i);
            }
        }
        int index = new Random().nextInt(list.size());
        return list.get(index);
    }

    public static void main(String[] args) {

    }

}
