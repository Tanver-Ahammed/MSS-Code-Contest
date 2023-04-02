package com.tanver.Competitive.leetcode.problems;

public class P1732_FindTheHighestAltitude {

    public int largestAltitude(int[] gain) {
        int heighest = 0;
        int prev = 0;
        for (int curr : gain) {
            prev += curr;
            heighest = Math.max(prev, heighest);
        }
        return heighest;
    }

    public static void main(String[] args) {

    }

}
