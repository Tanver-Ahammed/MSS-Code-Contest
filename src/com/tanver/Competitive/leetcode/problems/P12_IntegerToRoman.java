package com.tanver.Competitive.leetcode.problems;

public class P12_IntegerToRoman {

    public String intToRoman(int num) {
        String[] ones = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hundreds = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] thousands = new String[]{"", "M", "MM", "MMM"};
        return thousands[num / 1000] + hundreds[(num % 1000) / 100] + tens[(num % 100) / 10] + ones[num % 10];
    }

    public String intToRoman2(int num) {
        StringBuilder roman = new StringBuilder();
        int[] storeInt = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] storeRoman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < storeInt.length; i++) {
            while (num >= storeInt[i]) {
                roman.append(storeRoman[i]);
                num -= storeInt[i];
            }
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        System.out.println(new P12_IntegerToRoman().intToRoman(2581));
    }

}
