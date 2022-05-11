package com.tanver.Competitive.codeforces.practice.ProblemSet;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
*/
import java.util.Scanner;

public class A_677 {
    private int vanyaAndFence(int []a,int h){
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]<=h)
                count++;
            else
                count+=2;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        A_677 VFObj = new A_677();
        int n,h;
        n = scanner.nextInt();
        h = scanner.nextInt();
        int []a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int result = VFObj.vanyaAndFence(a,h);
        System.out.println(result);
    }
}
