package com.tanver.Competitive.ostad.app.stack.queue;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstUniqueCharacter {

    private static char findFirstNonDup1(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : s.toCharArray()) {
            if (map.get(ch) == 1)
                return ch;
        }
        return 'N';
    }

    private static char findFirstNonDup2(String s) {
        int ans = s.length();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int index = s.indexOf(ch);
            if (index != -1 && index == s.lastIndexOf(ch)) {
                ans = Math.min(ans, index);
            }
        }
        return ans == s.length() ? 'N' : s.charAt(ans);
    }

    public static void main(String[] args) {
        /**
         * Write your Java code from here
         */
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            String s = scanner.next();
            System.out.println(findFirstNonDup1(s));
        }
    }

}
