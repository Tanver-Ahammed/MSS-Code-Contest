package com.tanver.Competitive.codeforces.practice.ProblemSet;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
problem    :  A. Bus to Udayland
*/
import java.util.Scanner;

public class A_711 {
    private static void busSeatBooking(String[] st) {
        boolean flag = false;
        int temp = 0;
        for (int i = 0; i < st.length; i++) {
            if (st[i].substring(0, 2).equals("OO") || st[i].substring(3, 5).equals("OO")) {
                flag = true;
                temp = i;
                break;
            }
        }
        if (!flag)
            System.out.println("NO");
        else {
            System.out.println("YES");
            for (int i = 0; i < st.length; i++) {
                if (i != temp)
                    System.out.println(st[i]);
                else {
                    flag = false;
                    if (st[i].substring(0, 2).equals("OO")) {
                        flag = true;
                    }
                    if (flag)
                        System.out.println("++" + st[i].substring(2, 5));
                    else
                        System.out.println(st[i].substring(0, 3) + "++");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            String[] st = new String[n];
            for (int i = 0; i < n; i++) {
                st[i] = scanner.next();
            }
            busSeatBooking(st);
        }
    }
}
