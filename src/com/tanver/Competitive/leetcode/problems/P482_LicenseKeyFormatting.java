package com.tanver.Competitive.leetcode.problems;

public class P482_LicenseKeyFormatting {

    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == '-')
                continue;
            if (ch >= 'a')
                ch = (char) (ch - 'a' + 'A');
            if (counter == k) {
                counter = 1;
                sb.append('-').append(ch);
            } else {
                sb.append(ch);
                ++counter;
            }
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        P482_LicenseKeyFormatting obj = new P482_LicenseKeyFormatting();
        System.out.println(obj.licenseKeyFormatting("uighuogouguyg-kj--bj-bj-bj-b-jb-j", 4));
    }

}
