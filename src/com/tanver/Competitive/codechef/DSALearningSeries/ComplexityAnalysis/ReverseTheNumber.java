package com.tanver.Competitive.codechef.DSALearningSeries.ComplexityAnalysis;

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int temp=0,revNum=0;
            temp=arr[i];
            while (temp!=0){
                int a = temp%10;
                revNum=revNum*10+a;
                temp=temp/10;
            }
            System.out.println(revNum);
        }
    }
}
