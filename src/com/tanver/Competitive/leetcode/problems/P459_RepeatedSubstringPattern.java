package com.tanver.Competitive.leetcode.problems;

public class P459_RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern1(String s) {
        int size = s.length();
        String sFold = s.substring(1, size) + s.substring(0, size - 1);
        return sFold.contains(s);
    }

    public boolean repeatedSubstringPattern2(String s) {
        int l = s.length();
        for (int i = l / 2; i >= 1; i--) {
            if (l % i == 0) {
                int m = l / i;
                String subS = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                sb.append(subS.repeat(m));
                if (sb.toString().equals(s)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new P459_RepeatedSubstringPattern().
                repeatedSubstringPattern1(""));
    }

}
