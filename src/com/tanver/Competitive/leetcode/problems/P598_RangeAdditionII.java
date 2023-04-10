package com.tanver.Competitive.leetcode.problems;

public class P598_RangeAdditionII {

    public int maxCount(int m, int n, int[][] ops) {
        for (int[] op : ops) {
            if (op[0] < m)
                m = op[0];
            if (op[1] < n)
                n = op[1];
        }
        return m * n;
    }

    public static void main(String[] args) {
        System.out.println(new P598_RangeAdditionII()
                .maxCount(3, 3, new int[][]{{2, 2}, {3, 3}}));
    }

}
