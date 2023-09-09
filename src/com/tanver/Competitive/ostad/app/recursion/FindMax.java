package com.tanver.Competitive.ostad.app.recursion;

public class FindMax {

    private int findMax(int[] arr, int low, int high) {
        if (low >= high)
            return arr[high];
        return Math.max(arr[low], findMax(arr, low + 1, high));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 50, 7, 8, 9, 10};
        System.out.println(new FindMax().findMax(arr, 0, arr.length - 1));
    }

}
