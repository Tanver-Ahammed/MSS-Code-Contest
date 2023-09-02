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
            if (flag) list.add(arr[i]);
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


class GreaterThanAllToTheRight1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = scanner.nextInt();
            List<Integer> result = findElementsGreaterThanAllToRight(arr);
            for (int i = 0; i < result.size() - 1; i++)
                System.out.print(result.get(i) + " ");
            System.out.println(result.get(result.size() - 1));
        }
        scanner.close();
    }

    public static List<Integer> findElementsGreaterThanAllToRight(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int maxRight = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > maxRight)
                result.add(arr[i]);
            maxRight = Math.max(maxRight, arr[i]);
        }
        Collections.sort(result);
        return result;
    }
}
