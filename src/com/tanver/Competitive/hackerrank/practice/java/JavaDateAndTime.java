package com.tanver.Competitive.hackerrank.practice.java;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class JavaDateAndTime {
    static List<String> days = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY");

    private static void getDay(String month, String day, String year) {
        int y = Integer.parseInt(year);
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);

        Calendar calendar = Calendar.getInstance();
        calendar.set(y, m - 1, d);
        int dayNum = calendar.get(Calendar.DAY_OF_WEEK);
        String s = days.get(dayNum - 1);
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.next();
        String day = scanner.next();
        String year = scanner.next();
        getDay(month, day, year);
    }
}
