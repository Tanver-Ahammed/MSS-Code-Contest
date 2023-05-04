package com.tanver.Competitive.gfg.problems;

public class MaxMin {

    // https://practice.geeksforgeeks.org/problems/max-min/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab

    public static int findSum(int[] A, int N) {
        //code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int curr : A) {
            if (curr < min)
                min = curr;
            if (curr > max)
                max = curr;
        }
        return min + max;
    }

    public static void main(String[] args) {

    }

}
