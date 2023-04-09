package com.tanver.Competitive.leetcode.problems;

import java.util.Random;

class ShuffleAnArraySolution {

    int[] arr;
    int[] shuffleArr;

    public ShuffleAnArraySolution(int[] nums) {
        arr = nums;
        shuffleArr = nums;
    }

    public int[] reset() {
        return arr;
    }

    public int[] shuffle() {
        int t1 = new Random().nextInt(arr.length);
        int t2 = new Random().nextInt(arr.length);
        int temp = shuffleArr[t1];
        shuffleArr[t1] = shuffleArr[t2];
        shuffleArr[t2] = temp;
        return shuffleArr;
    }

}

public class P384_ShuffleAnArray {

    public static void main(String[] args) {
        System.out.println(new Random().nextInt(6));
    }

}
