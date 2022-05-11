package com.tanver.Competitive.codeforces.practice.ProblemSet;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
problem    :  B. CopyCopyCopyCopyCopy
*/
import java.util.Arrays;
import java.util.Scanner;

public class B_1325 {
    private static void copy(int []a){
        int count=1;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i]!=a[i+1])
                count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            Arrays.sort(a);
            copy(a);
        }
    }
}
