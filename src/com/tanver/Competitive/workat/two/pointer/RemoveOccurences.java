package com.tanver.Competitive.workat.two.pointer;

public class RemoveOccurences {

    int removeOccurences(int[] A, int k) {
        // add your logic here
        int len = A.length;
        int left = 0;
        int right = len - 1;
        int counter = 0;
        while (left <= right) {
            if (A[left] == k) {
                ++counter;
                if (left == right)
                    break;
            }
            if (A[right] == k)
                ++counter;
            ++left;
            --right;
        }
        return (len - counter);
    }

    public static void main(String[] args) {
//        System.out.println(new RemoveOccurences().removeOccurences(new int[]{1, 4, 2, 6, 2, 6, 9, 4}, 4));
        System.out.println(new RemoveOccurences().removeOccurences(new int[]{1, 1, 1, 2, 2}, 1));
    }

}
