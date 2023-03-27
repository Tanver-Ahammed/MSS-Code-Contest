package com.tanver.Competitive.leetcode.problems;

public class P168_ExcelSheetColumnTitle {

    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        char ch = 0;
        while (columnNumber > 26) {
            int currentChar = columnNumber % 26;
            if (currentChar == 0)
                ch = 'Z';
            else
                ch = (char) (currentChar + 64);
            columnNumber /= 26;
            sb.append(ch);
        }
        sb.append((char) (columnNumber + 64));
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new P168_ExcelSheetColumnTitle().convertToTitle(700));
        System.out.println(new P168_ExcelSheetColumnTitle().convertToTitle(701));
        System.out.println(new P168_ExcelSheetColumnTitle().convertToTitle(702));
        System.out.println(new P168_ExcelSheetColumnTitle().convertToTitle(703));
    }

}
