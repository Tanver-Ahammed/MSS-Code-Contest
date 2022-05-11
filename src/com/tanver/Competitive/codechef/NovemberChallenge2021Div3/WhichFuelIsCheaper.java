package com.tanver.Competitive.codechef.NovemberChallenge2021Div3;

import java.util.Scanner;

public class WhichFuelIsCheaper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int k = scanner.nextInt();

            int totalPetrol = x + a * k;
            int totalDiesel = y + b * k;

            if (totalPetrol < totalDiesel)
                System.out.println("PETROL ");
            else if (totalPetrol > totalDiesel)
                System.out.println("DIESEL ");
            else
                System.out.println("SAME PRICE");

        }
    }
}
