package com.tanver.Competitive.hackerrank.practice.java;

import java.util.*;

public class JavaMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int phone = scanner.nextInt();
            scanner.nextLine();
            map.put(name, phone);
        }

        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            try {
                int out = map.get(s);
                System.out.println(s + "=" + out);
            } catch (Exception e) {
                System.out.println("Not found");
            }
        }
    }
}
