package com.tanver.Competitive.atcoder.abc_42;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
problem    :  ABC-042 B - Iroha Loves Strings
*/
import java.util.Arrays;
import java.util.Scanner;

public class B_IrohaLovesStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,l;
        n = scanner.nextInt();
        l = scanner.nextInt();
        String []a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.next();
        }
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
