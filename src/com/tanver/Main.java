package com.tanver;

import java.util.*;

public class Main {

    public int majorityElement(final List<Integer> A) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = A.size();
        for (int a : A) {
            map.put(a, map.getOrDefault(a, 0) + 1);
            int val = map.get(a);
            if (val > n / 2)
                return a;
        }
        return -1;
    }

//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>(List.of(2, 1, 1));
//        System.out.println(new Main().majorityElement(list));
//        Stack stack = null;
//        System.out.println(stack.pop());
//    }

    private static String isValidBracket(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(')
                stack.push(')');
            else if (ch == '{')
                stack.push('}');
            else if (ch == '[')
                stack.push(']');
            else {
                if (stack.isEmpty())
                    return "Not Valid";
                char pop = stack.pop();
                if (pop != ch)
                    return "Not Valid";
            }
        }
        return stack.isEmpty() ? "Valid" : "Not Valid";
    }

    public static void main(String[] args) {
        /**
         * Write your Java code from here
         */
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            String s = scanner.next();
            System.out.println(isValidBracket(s));
        }
    }

}


class Check {

    private int takingTime(int[] arr, int k) {
        int totalTime = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                totalTime += Math.min(arr[i], arr[k]);
            } else {
                totalTime += arr[i];
            }
        }
        return totalTime;
    }

}