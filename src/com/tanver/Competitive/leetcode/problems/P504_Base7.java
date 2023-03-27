package com.tanver.Competitive.leetcode.problems;

public class P504_Base7 {

    public String convertToBase7(int num) {
        if (num == 0)
            return "0";
        StringBuilder sb = new StringBuilder();
        boolean flag = num < 0;
        while (num != 0) {
            sb.append(Math.abs(num % 7));
            num /= 7;
        }
        if (flag)
            sb.append('-');
        return sb.reverse().toString();
    }

}
