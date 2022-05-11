package com.tanver.Competitive.hackerrank.practice.datastructures.arrays;

import java.util.Scanner;

public class SparseArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfString = scanner.nextInt();
        String[] strings = new String[numberOfString];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.next();
        }
        int numberOfQueries = scanner.nextInt();
        String[] queries = new String[numberOfQueries];
        for (int i = 0; i < queries.length; i++) {
            queries[i] = scanner.next();
            int stayOfString = 0;
            for (int j = 0; j < strings.length; j++) {
                if (strings[j].equalsIgnoreCase(queries[i]))
                    ++stayOfString;
            }
            System.out.println(stayOfString);
        }
    }
}
