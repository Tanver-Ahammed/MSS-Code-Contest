package com.tanver.Competitive.codechef.CodeNiumhallenge;

import java.util.*;

public class AlphabetDifference {
    private static void difference(String a, String b) {

        Set<Character> st1 = new TreeSet<>();
        Set<Character> st2 = new TreeSet<>();

        for (char ch : a.toCharArray()) {
            st1.add(ch);
        }
        for (char ch : b.toCharArray()) {
            st2.add(ch);
        }

        List<Character> characters1 = new ArrayList<>();
        List<Character> characters2 = new ArrayList<>();

        for (Character ch : st1)
            characters1.add(ch);
        for (Character ch : st2)
            characters2.add(ch);

        for (int i = 0; i < characters1.size(); i++) {
            for (int j = 0; j < characters2.size(); j++) {
                if (characters1.get(i) == characters2.get(j)) {
                    characters2.remove(j);
                    break;
                }
            }
        }

        if (characters2.size() == 0)
            System.out.println(-1);
        else{
            for (Character ch : characters2) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            String a = scanner.next();
            String b = scanner.next();
            difference(a, b);
        }
    }
}
