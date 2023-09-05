package com.tanver.Competitive.ostad.app.stack.queue;

public class StackQueueCodingTest {

    private int takingTime1(int[] arr, int k) {
        int totalTime = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0)
                continue;
            if (i <= k)
                totalTime += Math.min(arr[i], arr[k]);
            else {
                totalTime += Math.min(arr[i], arr[k]) - 1;
            }
        }
        return totalTime;
    }

    public static void main(String[] args) {
        System.out.println(new StackQueueCodingTest().takingTime1(new int[]{2, 3, 2}, 1));
        System.out.println(new StackQueueCodingTest().takingTime1(new int[]{5, 1, 1, 1}, 0));
    }

}
