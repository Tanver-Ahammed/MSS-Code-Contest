package com.tanver.Competitive.atcoder.agc55;

import java.util.Scanner;

public class B_ABCSupermacy {
    private static boolean isSupremacy(String s, String t) {
        if (s.equals(t))
            return true;
        char[] chars = new char[s.length()];
        int i = 0;
        for (i = 0; i < s.length() - 1; i++) {
            chars[i] = s.charAt(i + 1);
        }
        chars[i] = s.charAt(0);
        String newString = String.valueOf(chars);
        if (newString.equals(t))
            return true;

        for (i = 0; i < s.length() - 2; i++) {
            chars[i] = s.charAt(i + 2);
        }
        chars[i] = s.charAt(0);
        chars[++i] = s.charAt(1);
        newString = String.valueOf(chars);
        if (newString.equals(t))
            return true;

        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        String t = scanner.next();
        if (isSupremacy(s, t))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
