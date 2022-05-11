package com.tanver.Competitive.atcoder.abc_188;

import java.util.Scanner;

public class A_ThreePointShot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int a,b;
            a = scanner.nextInt();
            b = scanner.nextInt();
            int temp = Math.abs(a-b);
            if (temp<3)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
