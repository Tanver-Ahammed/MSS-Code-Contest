package com.tanver;

import java.util.Arrays;

@FunctionalInterface
interface Calculator {
    void add(int a, int b);
}

class Calc {
    public static void addSomething(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public void letsAdd(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}

@FunctionalInterface
interface Messenger {
    Message getMessage(String msg);
}

class Message {
    Message(String msg) {
        System.out.println(">>Message is: " + msg);
    }
}

public class Main {
    public static void main(String[] args) {

        Calc.addSomething(10, 20);

        // 1. Reference to static method
        Calculator methodReferenceStaticMethod = Calc::addSomething;
        methodReferenceStaticMethod.add(10, 25);

        // 2. Reference to non-static method
        Calc obj = new Calc();
        Calculator methodReferenceNonStaticMethod = obj::letsAdd;
        methodReferenceNonStaticMethod.add(25, 75);

        // 2. Reference to Constructor
        Messenger cRef = Message::new;
        cRef.getMessage("I am Tanver");

    }
}


class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        if (digits[len - 1] < 9) {
            digits[len - 1] = digits[len - 1] + 1;
            return digits;
        } else {
            boolean isAll9 = true;
            for (int digit : digits) {
                if (digit != 9) {
                    isAll9 = false;
                    break;
                }
            }
            if (isAll9) {
                int[] result = new int[len + 1];
                result[0] = 1;
                return result;
            } else {
                int carry = 1;
                digits[len - 1] = 0;
                for (int i = digits.length - 2; i >= 0; i--) {
                    digits[i] += carry;
                    if (digits[i] == 10)
                        digits[i] = 0;
                    else
                        break;
                }
                return digits;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.plusOne(new int[]{9, 9, 8, 9})));
    }

}