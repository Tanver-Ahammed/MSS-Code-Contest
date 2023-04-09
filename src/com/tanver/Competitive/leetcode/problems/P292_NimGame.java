package com.tanver.Competitive.leetcode.problems;

public class P292_NimGame {

    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        System.out.println(new P292_NimGame().canWinNim(51));
    }

}
