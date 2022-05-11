package com.tanver.Competitive.codeforces.contest.CodeforcesRound690Div3;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
problem    :  1462 A - Favorite Sequence
*/

import java.util.Scanner;

public class A_FavoriteSequence {
    private static void favSentence(int[] arr) {
        int len = arr.length / 2;
        if (len == 0)
            System.out.println(arr[0]);
        else {
            boolean flag = false;
            if (arr.length % 2 == 1)
                flag = true;
            for (int i = 0; i < len; i++) {
                if (i == len - 1)
                    System.out.print(arr[i] + " " + arr[arr.length - i - 1]);
                else
                    System.out.print(arr[i] + " " + arr[arr.length - i - 1] + " ");
            }
            if (flag)
                System.out.println(" " + arr[arr.length/2]);
            else
                System.out.println();
        }
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
            favSentence(arr);
        }
    }
}
