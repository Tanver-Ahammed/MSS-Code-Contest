package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P2138_DivideAStringIntoGroupsOfSizeK {

    public String[] divideString1(String s, int k, char fill) {
        List<String> result = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            word.append(s.charAt(i));
            ++counter;
            if (counter == k) {
                result.add(word.toString());
                counter = 0;
                word.setLength(0);
            }
        }
        if (!word.isEmpty()) {
            word.append(String.valueOf(fill).repeat(Math.max(0, k - word.length())));
            result.add(word.toString());
        }
        return result.toArray(new String[0]);
    }

    public String[] divideString2(String s, int k, char fill) {
        int len = s.length();
        int n = len/k;
        String[] res = new String[len%k == 0 ? n : n + 1];

        int i = 0;
        int j = 0;

        for(i = 0; i < n*k; i = i + k) {
            res[j++] = s.substring(i, i + k);
        }

        if(i < len) {
            StringBuilder sb = new StringBuilder();
            sb.append(s, i, len);
            sb.append(String.valueOf(fill).repeat(Math.max(0, k - sb.length())));
            res[j] = sb.toString();
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new P2138_DivideAStringIntoGroupsOfSizeK()
                .divideString1("abcdefghi", 3, 'x')));
    }

}
