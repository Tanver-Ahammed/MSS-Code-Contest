package com.tanver.Competitive.codeforces.practice.ProblemSet;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
problem    :  228 A. Is your horseshoe on the other hoof?
*/
import java.util.Arrays;
import java.util.Scanner;

public class A_228 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int count=0;
        for (int i = 0; i < 3; i++) {
            if (a[i]==a[i+1])
                count++;
        }
        System.out.println(count);
    }
}
