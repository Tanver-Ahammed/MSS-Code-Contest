package com.tanver.Competitive.hackerrank.practice.algorithms.strings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TwoStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            String string1 = scanner.next();
            String string2 = scanner.next();
            TreeSet<Character> char1 = new TreeSet<>();
            TreeSet<Character> char2 = new TreeSet<>();

            for (int i = 0; i < string1.length(); i++) {
                char1.add(string1.charAt(i));
            }

            for (int i = 0; i < string2.length(); i++) {
                char2.add(string2.charAt(i));
            }

            ArrayList<Character> list1 = new ArrayList<>();
            ArrayList<Character> list2 = new ArrayList<>();

            list1.addAll(char1);
            list2.addAll(char2);

            boolean flag = false;

            for (int i = 0; i < list1.size(); i++) {
                for (int j = 0; j < list2.size(); j++) {
                    if (list1.get(i) == list2.get(j)) {
                        flag = true;
                        break;
                    }
                }
            }

            if (flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
