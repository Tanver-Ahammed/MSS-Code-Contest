package com.tanver.Competitive.codeforces.contest.CodeforcesGlobalRound12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A_Avoid_Trygub {
    private static void function(String st) {
        ArrayList<Character> chLetter = new ArrayList<>();
        String temp = "trygub";
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == temp.charAt(index)) {
                ++index;
                if (index == 6) {
                    flag = true;
                    break;
                }
            }
        }
        if (!flag)
            System.out.println(st);
        else {
            for (char ch : st.toCharArray()) {
                if (ch == 't' || ch == 'r' || ch == 'y' || ch == 'g' || ch == 'u' || ch == 'b') {
                    chLetter.add(ch);
                } else {
                    System.out.print(ch);
                }
            }
            Collections.sort(chLetter);
            for (int i = 0; i < chLetter.size(); i++) {
                System.out.print(chLetter.get(i));
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String st = scanner.next();
            function(st);
        }
    }
}
