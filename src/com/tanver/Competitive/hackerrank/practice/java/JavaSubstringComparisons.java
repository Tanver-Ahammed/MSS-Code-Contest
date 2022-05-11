package com.tanver.Competitive.hackerrank.practice.java;

import java.util.*;

public class JavaSubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        List<String> subStringList = new ArrayList<>();
        for (int i = 0; i < s.length() - k + 1; i++) {
            String temp = s.substring(i, i + k);
            subStringList.add(temp);
        }
        Collections.sort(subStringList);
        smallest = subStringList.get(0);
        largest = subStringList.get(s.length() - k);
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
