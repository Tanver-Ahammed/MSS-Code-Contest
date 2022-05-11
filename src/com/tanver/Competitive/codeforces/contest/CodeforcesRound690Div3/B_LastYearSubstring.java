package com.tanver.Competitive.codeforces.contest.CodeforcesRound690Div3;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
problem    :  1462 B. Last Year's Substring
*/

import java.util.Scanner;

public class B_LastYearSubstring {
    private static void match2020(String st) {
        int len = st.length();
        if (st.substring(0, 4).equals("2020") || st.substring(len - 4, len).equals("2020"))
            System.out.println("YES");
        else if (st.substring(0, 3).equals("202") && st.substring(len - 1, len).equals("0"))
            System.out.println("YES");
        else if (st.substring(0, 2).equals("20") && st.substring(len - 2, len).equals("20"))
            System.out.println("YES");
        else if (st.substring(0, 1).equals("2") && st.substring(len - 3, len).equals("020"))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int n = scanner.nextInt();
            String st = scanner.next();
            if (st.length() < 4)
                System.out.println("NO");
            else
                match2020(st);
        }
    }
}
