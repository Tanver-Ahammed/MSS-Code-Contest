package com.tanver.Competitive.leetcode.problems;

public class P461_HammingDistance {

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

}
