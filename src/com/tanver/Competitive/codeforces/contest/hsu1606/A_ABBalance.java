package com.tanver.Competitive.codeforces.contest.hsu1606;

import java.util.Scanner;

public class A_ABBalance {
    private static String abBalance(String st) {
        int len = st.length();
        char[] chars = st.toCharArray();
        int ab = 0;
        int ba = 0;
        for (int i = 0; i < len - 1; i++) {
            int j = len - 1 - i;
            if (chars[i] == 'a' && chars[i + 1] == 'b')
                ++ab;
            if (chars[j] == 'a' && chars[j - 1] == 'b')
                ++ba;
        }
        if (ab == ba)
            return st;
        else {
            int temp = 0;
            if (ab > ba) {
                for (int i = 0; i < len; i++) {
                    if (chars[i] == 'a' && chars[i + 1] == 'b') {
                        chars[i] = 'b';
                        ++temp;
                        if (temp == (ab - ba))
                            break;
                    }
                }
            } else {
                for (int i = len - 1; i >= 0; i--) {
                    if (chars[i] == 'a' && chars[i - 1] == 'b') {
                        chars[i] = 'a';
                        ++temp;
                        if (temp == (ba - ab))
                            break;
                    }
                }
            }
            String str = String.valueOf(chars);
            return str;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            String st = scanner.next();
            System.out.println(abBalance(st));
        }
    }
}
