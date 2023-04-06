package com.tanver.Competitive.leetcode.problems;

public class P1556_ThousandSeparator {

    public String thousandSeparator(int n) {
        StringBuilder result = new StringBuilder();
        String numberString = Integer.toString(n);
        int len = numberString.length();
        if (len < 4)
            return numberString;
        len = len % 3;
        if (len > 0)
            result.append(numberString, 0, len).append('.');
        int counter = 0;
        for (int i = len; i < numberString.length(); i++) {
            result.append(numberString.charAt(i));
            if (++counter == 3) {
                if (i != (numberString.length() - 1))
                    result.append('.');
                counter = 0;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new P1556_ThousandSeparator().thousandSeparator(1234567890));
    }

}
