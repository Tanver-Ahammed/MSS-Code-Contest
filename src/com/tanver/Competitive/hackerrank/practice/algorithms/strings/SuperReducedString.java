package com.tanver.Competitive.hackerrank.practice.algorithms.strings;

import java.util.Arrays;
import java.util.Scanner;

public class SuperReducedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.next();
        char[] stringChar = st.toCharArray();
        Arrays.sort(stringChar);

        String newString = "";
        int i = 0;
        for (i = 0; i < stringChar.length - 1; i++) {
            if (stringChar[i] == stringChar[i + 1]) {
                ++i;
            } else {
                newString = newString + stringChar[i];
            }
        }
        if (i == st.length() - 1)
            newString += stringChar[i];

        if (newString.equals(""))
            System.out.println("Empty String");
        else
            System.out.println(newString);
    }
}
