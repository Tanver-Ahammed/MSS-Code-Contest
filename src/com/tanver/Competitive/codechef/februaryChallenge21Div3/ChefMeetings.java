package com.tanver.Competitive.codechef.februaryChallenge21Div3;

import java.util.ArrayList;
import java.util.Scanner;

public class ChefMeetings {
    private static Integer amPmTo24(String amPm) {
        Integer minute = 0;
        String hh = null;
        String mm = null;
        String ap = null;
        hh = amPm.substring(0, 2);
        mm = amPm.substring(3, 5);
        ap = amPm.substring(6, 8);
        if (hh.equalsIgnoreCase("12"))
            hh = "00";
        if (ap.equalsIgnoreCase("PM"))
            minute = 720;
        Integer h, m;
        h = Integer.parseInt(hh);
        m = Integer.parseInt(mm);

        minute = minute + h * 60 + m;
        return minute;
    }

    private static void isAbleAttendMeeting(String chefTime, ArrayList<String> times) {

        Integer pChefTime = amPmTo24(chefTime);

        for (int i = 0; i < times.size(); i++) {
            String timeOfL = times.get(i).substring(0, 8);
            Integer start = amPmTo24(timeOfL);
            String timeOfR = times.get(i).substring(9, 17);
            Integer end = amPmTo24(timeOfR);

            if (start <= pChefTime && end >= pChefTime)
                System.out.print(1);
            else
                System.out.print(0);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer testCse = scanner.nextInt();
        while (testCse-- > 0) {
            String chefTime = scanner.nextLine();
            if (chefTime.isEmpty())
                chefTime = scanner.nextLine();
            Integer n = scanner.nextInt();
            ArrayList<String> times = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String time = scanner.nextLine();
                if (time.isEmpty())
                    time = scanner.nextLine();
                times.add(time);
            }
            isAbleAttendMeeting(chefTime, times);
        }
    }
}