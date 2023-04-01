package com.tanver.Competitive.leetcode.problems;

public class P434_NumberOfSegmentsInAString {

    public int countSegments(String s) {
        int num = 0;
        boolean isPrevString = false;
        for (char ch : s.toCharArray()) {
            if (isPrevString && ch == ' ') {
                ++num;
                isPrevString = false;
            } else if (ch != ' ')
                isPrevString = true;
        }
        if (isPrevString)
            ++num;
        return num;
    }

    public static void main(String[] args) {

    }

}
