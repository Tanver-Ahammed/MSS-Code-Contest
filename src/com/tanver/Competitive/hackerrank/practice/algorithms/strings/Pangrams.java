package com.tanver.Competitive.hackerrank.practice.algorithms.strings;

import java.util.Scanner;
import java.util.TreeSet;

public class Pangrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pangString = scanner.nextLine();

        TreeSet<Character> characterArrayList = new TreeSet<>();
        for (char ch : pangString.toCharArray()) {
            if (ch != ' ') {
                ch = Character.toUpperCase(ch);
                characterArrayList.add(ch);
            }
        }

        if (characterArrayList.size() == 26)
            System.out.println("pangram");
        else
            System.out.println("not pangram");
    }
}
