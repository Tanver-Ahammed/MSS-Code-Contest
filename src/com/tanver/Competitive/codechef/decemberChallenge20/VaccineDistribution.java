package com.tanver.Competitive.codechef.decemberChallenge20;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
problem    :  December Challenge 2020 - Vaccine Distribution
*/

import java.util.ArrayList;
import java.util.Scanner;

public class VaccineDistribution {
    private static void detVaccineDay(int[] age, int vecPerDay) {
        int countVecDay = 0;
        ArrayList<Integer> risk = new ArrayList<>();
        ArrayList<Integer> nonRisk = new ArrayList<>();
        for (int i = 0; i < age.length; i++) {
            if (age[i] >= 80 || age[i] <= 9)
                risk.add(age[i]);
            else
                nonRisk.add(age[i]);
        }

        countVecDay = risk.size() / vecPerDay;
        if (risk.size() % vecPerDay != 0)
            countVecDay++;
        countVecDay += nonRisk.size() / vecPerDay;
        if (nonRisk.size() % vecPerDay != 0)
            countVecDay++;
        System.out.println(countVecDay);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int numOfPeople, vecPerDay;
            numOfPeople = scanner.nextInt();
            int[] age = new int[numOfPeople];
            vecPerDay = scanner.nextInt();
            for (int i = 0; i < age.length; i++) {
                age[i] = scanner.nextInt();
            }
            detVaccineDay(age, vecPerDay);
        }
    }
}
