package com.tanver.Competitive.codechef.decemberChallenge20;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
problem    :  December Challenge 2020 - Vaccine Production
*/
import java.util.Scanner;

public class VaccineProduction {
    private static void detDayOfVaccine(int day1, int vec1, int day2, int vec2, int people) {
        int countVaccine = 0, indexDay = 1;
        while (true) {
            if (indexDay >= day1)
                countVaccine += vec1;
            if (indexDay >= day2)
                countVaccine += vec2;
            if (countVaccine >= people)
                break;
            indexDay++;

        }
        System.out.println(indexDay);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int day1, vec1, day2, vec2, people;
            day1 = scanner.nextInt();
            vec1 = scanner.nextInt();
            day2 = scanner.nextInt();
            vec2 = scanner.nextInt();
            people = scanner.nextInt();
            detDayOfVaccine(day1, vec1, day2, vec2, people);
        }
    }
}
