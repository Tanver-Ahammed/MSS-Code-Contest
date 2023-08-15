package com.tanver.Competitive.ostad.app;

public class StringSortingByIndex {

    private String stringSort(String s, int[] arr) {
        int n = s.length();
        char[] chArr = new char[n];
        for (int i = 0; i < n; i++) {
            chArr[arr[i]] = s.charAt(i);
        }
        return new String(chArr);
    }

    public static void main(String[] args) {
        System.out.println(new StringSortingByIndex().stringSort("mamaCode", new int[]{4, 5, 6, 7, 0, 1, 2, 3}));
        System.out.println(new StringSortingByIndex().stringSort("dOsta", new int[]{4, 0, 1, 2, 3}));
        System.out.println(new StringSortingByIndex().stringSort("abc", new int[]{1, 0, 2}));
    }

}
