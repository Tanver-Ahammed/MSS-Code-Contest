package com.tanver.Competitive.leetcode.problems;

public class P2645_MinimumAdditionsToMakeValidString {

    public int addMinimum(String word) {
        int result = 0;
        int i = 0, n = word.length();
        while (i < n) {
            if (word.charAt(i) == 'a') {
                if (i + 1 < n && word.charAt(i + 1) == 'b') {
                    if (i + 2 < n && word.charAt(i + 2) == 'c')
                        i += 3;
                    else {
                        i += 2;
                        result++;
                    }
                } else if (i + 1 < n && word.charAt(i + 1) == 'c') {
                    i += 2;
                    result += 1;
                } else {
                    i++;
                    result += 2;
                }
            } else if (word.charAt(i) == 'b') {
                if (i + 1 < n && word.charAt(i + 1) == 'c') {
                    i += 2;
                    result += 1;
                } else {
                    i++;
                    result += 2;
                }
            } else {
                i++;
                result += 2;
            }
        }
        return result;
    }

    public int addMinimum1(String word) {
        int n = word.length();
        int i = 0;
        int result = 0;
        while (i < n) {
            int count = 0;
            if (word.charAt(i) == 'a') {
                count++;
                i++;
            }
            if (i < n && word.charAt(i) == 'b') {
                count++;
                i++;
            }
            if (i < n && word.charAt(i) == 'c') {
                count++;
                i++;
            }
            result += 3 - count;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new P2645_MinimumAdditionsToMakeValidString()
                .addMinimum("aabb"));
    }

}
