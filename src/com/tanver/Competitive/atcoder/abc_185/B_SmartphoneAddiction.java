package com.tanver.Competitive.atcoder.abc_185;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
problem    :  ABC-185 B - Smartphone Addiction
*/
import java.util.Scanner;

public class B_SmartphoneAddiction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int capacity, stopCafe, totalTime, countBatteryCharge = 0;
            capacity = scanner.nextInt();
            stopCafe = scanner.nextInt();
            totalTime = scanner.nextInt();
            int[] startTime = new int[stopCafe];
            int[] stopTime = new int[stopCafe];
            for (int i = 0; i < stopCafe; i++) {
                startTime[i] = scanner.nextInt();
                stopTime[i] = scanner.nextInt();
            }

            boolean flag = true;
            countBatteryCharge = capacity - startTime[0];
            if (countBatteryCharge <= 0) {
                flag = false;
            }

            countBatteryCharge += stopTime[0] - startTime[0];
            if (countBatteryCharge > capacity)
                countBatteryCharge = capacity;

            for (int i = 1; i < stopCafe; i++) {
                countBatteryCharge -= startTime[i] - stopTime[i - 1];
                if (countBatteryCharge < 0)
                    countBatteryCharge -= 0;

                countBatteryCharge += stopTime[i] - startTime[i];
                if (countBatteryCharge > capacity)
                    countBatteryCharge += capacity;
            }

            countBatteryCharge -= totalTime - stopTime[stopCafe - 1];

            if (!flag || countBatteryCharge <= 0)
                System.out.println("No");
            else
                System.out.println("Yes");

        }
    }
}