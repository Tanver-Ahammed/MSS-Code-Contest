package com.tanver.Competitive.leetcode.problems;

public class P8_StringToInteger_atoi {

    public int myAtoi(String s) {
        boolean flag = false;
        boolean isPos = false;
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (flag && !(ch >= '0' && ch <= '9'))
                break;
            if (ch >= '0' && ch <= '9' || ch == '-') {
                sb.append(ch);
                flag = true;
            }
            if (!flag && ch != ' ' && ch != '+')
                return 0;
            if (ch == '+')
                isPos = true;
        }
        String number = sb.toString();
        if (number.length() == 0 || (number.length() == 1 && number.charAt(0) == '-'))
            return 0;
        if (number.equals("-+") || (isPos && number.charAt(0) == '-'))
            return 0;
        try {
            return Integer.parseInt(String.valueOf(sb));
        } catch (NumberFormatException e) {
            if (number.charAt(0) == '-')
                return Integer.MIN_VALUE;
            else
                return Integer.MAX_VALUE;
        }
    }

    public static void main(String[] args) {
        System.out.println(new P8_StringToInteger_atoi().myAtoi("+11e530408314") == 11);
        System.out.println(new P8_StringToInteger_atoi().myAtoi("  +  413") == 0);
        System.out.println(new P8_StringToInteger_atoi().myAtoi("+-12") == 0);
        System.out.println(new P8_StringToInteger_atoi().myAtoi("-+12") == 0);
        System.out.println(new P8_StringToInteger_atoi().myAtoi("+1") == 1);
        System.out.println(new P8_StringToInteger_atoi().myAtoi("  -42") == -42);
        System.out.println(new P8_StringToInteger_atoi().myAtoi(".1") == 0);
        System.out.println(new P8_StringToInteger_atoi().myAtoi("&1") == 0);
        System.out.println(new P8_StringToInteger_atoi().myAtoi("words and 987") == 0);
        System.out.println(new P8_StringToInteger_atoi().myAtoi("4193 with words") == 4193);
        System.out.println(new P8_StringToInteger_atoi().myAtoi("42") == 42);
        System.out.println(new P8_StringToInteger_atoi().myAtoi("words and 987") == 0);
        System.out.println(new P8_StringToInteger_atoi().myAtoi("-91283472332") == -2147483648);
        System.out.println(new P8_StringToInteger_atoi().myAtoi("91283472332") == 2147483647);
    }

}
