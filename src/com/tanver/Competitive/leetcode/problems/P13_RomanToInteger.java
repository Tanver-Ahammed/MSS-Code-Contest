package com.tanver.Competitive.leetcode.problems;

public class P13_RomanToInteger {

    private int value(char r) {
        if (r == 'I')
            return 1;
        else if (r == 'V')
            return 5;
        else if (r == 'X')
            return 10;
        else if (r == 'L')
            return 50;
        else if (r == 'C')
            return 100;
        else if (r == 'D')
            return 500;
        else if (r == 'M')
            return 1000;
        return -1;
    }

    public int romanToInt(String s) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            int val1 = value(s.charAt(i));
            if (i + 1 < s.length()) {
                int val2 = value(s.charAt(i + 1));
                if (val1 >= val2) {
                    number += val1;
                } else {
                    number += val2 - val1;
                    i++;
                }
            } else {
                number += val1;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        P13_RomanToInteger obj = new P13_RomanToInteger();
        System.out.println(obj.romanToInt("MCMXCIV"));
    }
}
