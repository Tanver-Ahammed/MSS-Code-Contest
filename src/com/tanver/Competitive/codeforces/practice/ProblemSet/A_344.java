package com.tanver.Competitive.codeforces.practice.ProblemSet;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
*/
import java.util.Scanner;

public class A_344 {
    private void magnets(int []a){
        int numberOfMagnets=1;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1])
                numberOfMagnets++;
        }
        System.out.println(numberOfMagnets);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        new A_344().magnets(a);
    }
}
