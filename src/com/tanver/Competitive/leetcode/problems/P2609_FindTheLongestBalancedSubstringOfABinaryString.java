package com.tanver.Competitive.leetcode.problems;

public class P2609_FindTheLongestBalancedSubstringOfABinaryString {

    public int findTheLongestBalancedSubstring(String s) {
        int maxLen = 0;
        int zeroCounter = 0;
        int oneCounter = 0;
        boolean isPrevOne = false;
        for (char ch : s.toCharArray()) {
            if (ch == '0') {
                if (isPrevOne)
                    zeroCounter = 1;
                else
                    zeroCounter++;
                oneCounter = 0;
                isPrevOne = false;
            } else {
                ++oneCounter;
                if (zeroCounter >= oneCounter) {
                    int temp = 2 * oneCounter;
                    if (temp > maxLen) {
                        maxLen = temp;
                    }
                }
                isPrevOne = true;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(new P2609_FindTheLongestBalancedSubstringOfABinaryString()
                .findTheLongestBalancedSubstring("111"));
    }

}
