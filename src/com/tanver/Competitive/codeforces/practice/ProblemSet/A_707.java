package com.tanver.Competitive.codeforces.practice.ProblemSet;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
*/
import java.util.Scanner;

public class A_707 {
    private static void brainPhotos(char[][] a) {
        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 'C' || a[i][j] == 'M' || a[i][j] == 'Y') {
                    flag = false;
                    break;
                }
            }
        }
        if (flag)
            System.out.println("#Black&White");
        else
            System.out.println("#Color");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m, n;
            m = scanner.nextInt();
            n = scanner.nextInt();
            char[][] a = new char[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = scanner.next().charAt(0);
                }
            }
            brainPhotos(a);
        }
    }
}
