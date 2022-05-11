package com.tanver.Competitive.hackerrank.practice.algorithms.strings;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StringConstruction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            String st = scanner.next();

            Set<Character> characters = new TreeSet<>();
            for (char ch : st.toCharArray()) {
                characters.add(ch);
            }
            System.out.println(characters.size());
        }
    }
}