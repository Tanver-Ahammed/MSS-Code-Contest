package com.tanver.Competitive.leetcode.problems;

public class P492_ConstructTheRectangle {

    public int[] constructRectangle(int area) {
        for (int i = (int) Math.sqrt(area); i > 0; i--) {
            if (area % i == 0)
                return new int[]{area / i, i};
        }
        return new int[]{area, 1};
    }

    public static void main(String[] args) {

    }

}
