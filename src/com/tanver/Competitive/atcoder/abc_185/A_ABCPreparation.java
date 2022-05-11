package com.tanver.Competitive.atcoder.abc_185;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
problem    :  ABC-185 A - ABC Preparation
*/
import java.util.Arrays;
import java.util.Scanner;

public class A_ABCPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int []a = new int[4];
            for (int i = 0; i < 4; i++) {
                a[i] = scanner.nextInt();
            }
            Arrays.sort(a);
            System.out.println(a[0]);
        }
    }
}
