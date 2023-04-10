package com.tanver.Competitive.leetcode.problems;

public class P1784_CheckIfBinaryStringHasAtMostOneSegmentOfOnes {

    // 110001
    public boolean checkOnesSegment(String s) {
        boolean isContainZero = false;
        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                if (isContainZero)
                    return false;
            } else
                isContainZero = true;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new P1784_CheckIfBinaryStringHasAtMostOneSegmentOfOnes()
                .checkOnesSegment("10000"));
    }

}
