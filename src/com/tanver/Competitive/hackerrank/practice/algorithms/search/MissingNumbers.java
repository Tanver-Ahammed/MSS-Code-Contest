 package com.tanver.Competitive.hackerrank.practice.algorithms.search;

import java.util.*;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        Queue<Integer> queue = new PriorityQueue<>(n);
        for (int i = 0; i < n; i++) {
            queue.add(scanner.nextInt());
        }
        for (int j : arr) {
            queue.remove(j);
        }


        TreeSet<Integer> set = new TreeSet<>(queue);

        ArrayList<Integer> list = new ArrayList<>(set);

        Collections.sort(list);

        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(list.get(list.size() - 1));
    }
}
