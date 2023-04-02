package com.tanver.Competitive.leetcode.problems;

public class P1266_MinimumTimeVisitingAllPoints {

    public int minTimeToVisitAllPoints(int[][] points) {
        int maxDistance = 0;
        for (int i = 1; i < points.length; i++) {
            maxDistance += Math.max(Math.abs(points[i - 1][0] - points[i][0]),
                    Math.abs(points[i - 1][1] - points[i][1]));
        }
        return maxDistance;
    }

    public static void main(String[] args) {
        System.out.println(new P1266_MinimumTimeVisitingAllPoints()
                .minTimeToVisitAllPoints(new int[][]{{1, 1}, {3, 4}, {-1, 0}}));
    }

}
