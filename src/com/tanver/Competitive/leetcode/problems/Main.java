package com.tanver.Competitive.leetcode.problems;


import java.util.Arrays;

public class Main {


    // intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
    // [[1,5],[6,9]]
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int index = 0;
        int first = -1;
        int last = -1;
        for (int i = 0; i < intervals.length; i++) {
            int[] arr = intervals[i];
            first = Math.min(arr[0], newInterval[0]);
            last = Math.max(arr[1], newInterval[1]);
        }
        return intervals;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Main().insert(new int[][]{{1, 3}, {6, 9}}, new int[]{1, 5})));
    }

}