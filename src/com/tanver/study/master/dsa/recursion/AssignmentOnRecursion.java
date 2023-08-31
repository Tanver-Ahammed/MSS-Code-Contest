package com.tanver.study.master.dsa.recursion;

public class AssignmentOnRecursion {

    /**
    time complexity :  O(min(a, b))
    space complexity:  O(n)  because, each recursive call adds a new frame to the call stack until the base case is reached.
    */
    private int calculateMultiplication(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        // base case
        if (a == 0)
            return 0;
        return b + calculateMultiplication(a - 1, b);
    }

    public static void main(String[] args) {
        System.out.println(new AssignmentOnRecursion().calculateMultiplication(1, 105));
    }

}
