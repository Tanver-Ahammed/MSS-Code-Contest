package com.tanver.Competitive;

public class Test {
    private int find(int[] arr, int index, int sValue) {
        if (index == arr.length)
            return -1;
        if (arr[index] == sValue)
            return sValue;

        return find(arr, index + 1, sValue);
    }

    private int max(int[] arr, int index, int max) {
        if (index == arr.length)
            return max;
        if (arr[index] > max)
            max = arr[index];

        return max(arr, index + 1, max);
    }

    private boolean isPalindrome(String word, int left, int right) {
        if (left > right)
            return true;
        if (word.charAt(left) != word.charAt(right))
            return false;
        return isPalindrome(word, left + 1, right - 1);
    }

    public static void main(String[] args) {

        String word = "madum";
        System.out.println(new Test().isPalindrome(word, 0, word.length() - 1));

        int[] arr = {1, 2, 3, 15, 5, 6, 7, 8, 9};
        System.out.println(new Test().max(arr, 0, Integer.MIN_VALUE));
    }
}