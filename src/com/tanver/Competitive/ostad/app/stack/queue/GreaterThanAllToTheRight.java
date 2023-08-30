package com.tanver.Competitive.ostad.app.stack.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GreaterThanAllToTheRight {

    private static void rightAllGreaterValue(int[] arr) {
        List<Integer> list = new ArrayList<>();
        aa:
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                list.add(arr[i]);
        }
        Collections.sort(list);
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(list.get(list.size() - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            rightAllGreaterValue(arr);
        }
    }

}
