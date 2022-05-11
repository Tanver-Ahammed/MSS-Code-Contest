package com.tanver.Competitive.atcoder.abc_42;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
problem    :  ABC-042 A - Iroha and Haiku
*/

import java.util.Scanner;

public class A_IrohaAndHaiku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a+b+c==17)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}