package com.tanver.Competitive.hackerrank.practice.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        int operation = scanner.nextInt();
        while (operation-- > 0) {
            String operationType = scanner.next();
            if (operationType.equalsIgnoreCase("Insert")) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                list.add(x, y);
            }
            else if (operationType.equalsIgnoreCase("Delete")) {
                int index = scanner.nextInt();
                list.remove(index);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
