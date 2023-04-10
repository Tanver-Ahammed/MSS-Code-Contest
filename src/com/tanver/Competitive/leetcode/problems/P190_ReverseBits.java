package com.tanver.Competitive.leetcode.problems;

public class P190_ReverseBits {

    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32; i++) {
            rev <<= 1;
            rev |= (n & 1);
            n >>= 1;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(new P190_ReverseBits().reverseBits(15));
    }

}
