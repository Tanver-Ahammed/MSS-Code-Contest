package com.tanver.Competitive.atcoder.abc_225;

import java.util.Scanner;

public class A_DistinctStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.next();
        if (st.charAt(0) == st.charAt(1) && st.charAt(1) == st.charAt(2))
            System.out.println(1);
        else if (st.charAt(0) != st.charAt(1) && st.charAt(1) != st.charAt(2) && st.charAt(2) != st.charAt(0))
            System.out.println(6);
        else
            System.out.println(3);
    }
}
