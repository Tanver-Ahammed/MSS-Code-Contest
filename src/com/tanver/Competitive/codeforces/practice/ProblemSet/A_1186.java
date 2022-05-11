package com.tanver.Competitive.codeforces.practice.ProblemSet;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
problem    :  A. Vus the Cossack and a Contest
*/
import java.util.Scanner;

public class A_1186 {
    private static void contestGift(int n, int m, int k) {
        if (n <= m && n <= k)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n, m, k;
            n = scanner.nextInt();
            m = scanner.nextInt();
            k = scanner.nextInt();
            contestGift(n, m, k);
        }
    }
}
