package com.tanver.Competitive.leetcode.problems;

public class P709_ToLowerCase {

    public String toLowerCase1(String s) {
        return s.toLowerCase();
    }

    public String toLowerCase2(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z')
                ch = (char) (ch - 'A' + 'a');
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new P709_ToLowerCase().
                toLowerCase2("al&phaBET"));
    }

}

// jxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga