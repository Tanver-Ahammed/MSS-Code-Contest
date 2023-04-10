package com.tanver.Competitive.leetcode.problems;

public class P2119_ANumberAfterADoubleReversal {

    public boolean isSameAfterReversals(int num) {
        return num % 10 != 0 || num == 0;
    }

    public static void main(String[] args) {
        System.out.println(new P2119_ANumberAfterADoubleReversal().isSameAfterReversals(54));
    }

}
