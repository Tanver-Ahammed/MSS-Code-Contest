package com.tanver.Competitive.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class P575_DistributeCandies {

    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int type : candyType)
            set.add(type);
        return Math.min(candyType.length / 2, set.size());
    }

    public static void main(String[] args) {
        System.out.println(new P575_DistributeCandies().distributeCandies(new int[]{1, 1, 2, 2, 6, 6, 6, 6}));
    }

}
