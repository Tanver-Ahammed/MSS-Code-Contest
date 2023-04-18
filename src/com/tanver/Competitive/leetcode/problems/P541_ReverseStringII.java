package com.tanver.Competitive.leetcode.problems;

public class P541_ReverseStringII {

    public String reverseStr(String s, int k) {
        char[] charArray = s.toCharArray();
        for (int left = 0; left < charArray.length; left += 2 * k) {
            for (int i = left, j = Math.min(left + k - 1, charArray.length - 1); i < j; i++, j--) {
                char tmp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = tmp;
            }
        }
        return new String(charArray);
    }


    public static void main(String[] args) {
        P541_ReverseStringII obj = new P541_ReverseStringII();
        System.out.println(obj);
    }

}
