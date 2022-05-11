package com.tanver.Competitive.codeforces.practice.ProblemSet;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
problem    :  A. LCM Problem
*/
import java.util.Scanner;

public class A_1389 {
    private static void lcmFunc(int l, int r) {
        if (2 * l > r)
            System.out.println("-1 -1");
        else
            System.out.println(l + " " + l * 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int l, r;
            l = scanner.nextInt();
            r = scanner.nextInt();
            lcmFunc(l, r);
        }
    }
}
