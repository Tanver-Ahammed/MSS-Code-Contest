package com.tanver.Competitive.leetcode.problems;

public class P744_FindSmallestLetterGreaterThanTarget {

    public char nextGreatestLetter1(char[] letters, char target) {
        char res = letters[0];
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] == target)
                start = mid + 1;
            else if (target > letters[mid])
                start = mid + 1;
            else if (letters[mid] > target) {
                res = letters[mid];
                end = mid - 1;
            }
        }
        return res;
    }

    public char nextGreatestLetter(char[] letters, char target) {
        for (char letter : letters)
            if (letter > target)
                return letter;
        return letters[0];

    }

    public static void main(String[] args) {

    }

}
