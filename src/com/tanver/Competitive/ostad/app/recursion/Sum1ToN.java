package com.tanver.Competitive.ostad.app.recursion;

public class Sum1ToN {

    private int sum1ToN(int[] arr, int high) {
        // base case
        if (high == 0)
            return arr[0];
        // recursive case
        return arr[high] + sum1ToN(arr, high - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(new Sum1ToN().sum1ToN(arr, arr.length - 1));
    }
}
