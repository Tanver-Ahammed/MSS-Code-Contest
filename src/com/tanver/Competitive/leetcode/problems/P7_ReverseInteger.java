package com.tanver.Competitive.leetcode.problems;

public class P7_ReverseInteger {
    public int reverse(long x) {
        long rev_val = 0;
        while (x != 0) {
            long temp = x % 10;
            rev_val = rev_val * 10 + temp;
            x = x / 10;
        }
        if (rev_val > Integer.MAX_VALUE || rev_val < Integer.MIN_VALUE)
            rev_val = 0;
        return (int) rev_val;
    }

    public static void main(String[] args) {
        P7_ReverseInteger obj = new P7_ReverseInteger();
        System.out.println(obj.reverse(300000029));
    }
}
