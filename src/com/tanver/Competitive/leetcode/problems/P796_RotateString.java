package com.tanver.Competitive.leetcode.problems;

public class P796_RotateString {

    public boolean rotateString1(String s, String goal) {
        int len = s.length();
        if (len > 0) {
            return (s + s).contains(goal);
        }
        return false;
    }

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        if (s.equals(goal))
            return true;
        int len = goal.length();
        while (len-- > 0) {
            if (s.equals(goal))
                return true;
            s = s.substring(1) + s.charAt(0);
        }
        return false;
    }

}
