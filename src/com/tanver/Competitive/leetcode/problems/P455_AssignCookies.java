package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P455_AssignCookies {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int answer = 0;
        int cookie = s.length - 1;
        int child = g.length - 1;
        while (cookie >= 0 && child >= 0) {
            if (g[child] <= s[cookie]) {
                answer++;
                cookie--;
            }
            child--;
        }
        return answer;
    }

    public static void main(String[] args) {

    }

}
