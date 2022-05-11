package com.tanver.Competitive.codechef.januaryChallenge21div3;

import java.util.Scanner;

public class EncodedString {
    private static void encodedString(String st) {
        int len;
        len = st.length();
        for (int i = 4; i <= len; i += 4) {
            String s = st.substring(i - 4, i);
            int temp = Integer.parseInt(s, 2);
            char ch = (char) (97 + temp);
            System.out.print(ch);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        while (testcase-- > 0) {
            int n = scanner.nextInt();
            String st = scanner.nextLine();
            if (st.isEmpty())
                st = scanner.nextLine();
            encodedString(st);
        }
    }
}
