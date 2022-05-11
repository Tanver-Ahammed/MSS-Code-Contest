package com.tanver.Competitive.codeforces.practice.ProblemSet;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
problem    :  469 A. I Wanna Be the Guy
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A_469 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,p,q,count=0,temp=0;
        ArrayList<Integer>addArray = new ArrayList<>();
        n = scanner.nextInt();
        p = scanner.nextInt();
        int []x = new int[p];
        for (int i = 0; i < p; i++) {
            x[i] = scanner.nextInt();
            addArray.add(x[i]);
        }
        q = scanner.nextInt();
        int []y = new int[q];
        for (int i = 0; i < q; i++) {
            y[i] = scanner.nextInt();
            addArray.add(y[i]);
        }

        Collections.sort(addArray);
        if (addArray.size()>0)
            temp=addArray.get(0);
        for (int i = 1; i < addArray.size(); i++) {
            if (temp+1 == addArray.get(i)){
                temp=addArray.get(i);
                count++;
                if (count==n-1)
                    break;
            }
        }
        if (count==n-1&&(p+q)>0)
            System.out.println("I become the guy.");
        else
            System.out.println("Oh, my keyboard!");
    }
}
