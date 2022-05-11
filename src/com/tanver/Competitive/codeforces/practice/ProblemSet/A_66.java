package com.tanver.Competitive.codeforces.practice.ProblemSet;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
*/
import java.util.Scanner;

public class A_66 {
    private static void fastMathematician(String st1,String st2){
        for (int i = 0; i < st1.length(); i++) {
            if (st1.charAt(i)==st2.charAt(i))
                System.out.print(0);
            else
                System.out.print(1);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st1,st2;
        st1 = scanner.next();
        st2 = scanner.next();
        fastMathematician(st1,st2);
    }
}
