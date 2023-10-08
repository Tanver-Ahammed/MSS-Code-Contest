package com.tanver;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    private static String isValidBracket(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') stack.push(')');
            else if (ch == '{') stack.push('}');
            else if (ch == '[') stack.push(']');
            else {
                if (stack.isEmpty()) return "Not Valid";
                char pop = stack.pop();
                if (pop != ch) return "Not Valid";
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

class Solution {
    // Time Complexity: O(n log n)
    public int codingTest(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));

        int maxUnits = 0;
        int remainingSpace = truckSize;

        for (int[] box : boxTypes) {
            int boxesToAdd = Math.min(remainingSpace, box[0]);
            maxUnits += boxesToAdd * box[1];
            remainingSpace -= boxesToAdd;

            if (remainingSpace == 0) {
                break;
            }
        }

        return maxUnits;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}};
        System.out.println(new Solution().codingTest(arr, 10));
    }
}

class BinarySearch {

    // this binary search algorithm.
    // Time Complexity: O(log n)
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    /**
     * Java is a OOP Programming Language.
     * {@snippet :
     *
     *      Thread thread = new Thread();
     *      Scanner sc = new Scanner(new File("myNumbers"));
     *      while (sc.hasNextLong()) {
     *          long aLong = sc.nextLong();
     *      }
     *}
     */

    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int target = 2;

        System.out.println(binarySearch(arr, target));
    }
}


