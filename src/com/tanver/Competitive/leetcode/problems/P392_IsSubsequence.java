package com.tanver.Competitive.leetcode.problems;

public class P392_IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;
        int index = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(index)) {
                ++index;
            }
            if (index == s.length())
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new P392_IsSubsequence().isSubsequence("abc", "ahbgdc"));
    }
}
