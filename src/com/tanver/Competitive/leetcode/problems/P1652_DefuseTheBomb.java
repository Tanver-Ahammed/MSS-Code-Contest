package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P1652_DefuseTheBomb {

    public int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];
        if (k >= 0) {
            int right = k;
            int rightSum = 0;
            for (int i = 0; i <= k; i++)
                rightSum += code[i];
            for (int i = 0; i < code.length; i++) {
                result[i] = rightSum - code[i];
                rightSum -= code[i];
                right = (++right) % code.length;
                rightSum += code[right];
            }
        } else {
            int left = code.length + k;
            int leftSum = 0;
            for (int i = code.length - 1; i >= code.length + k; i--)
                leftSum += code[i];
            for (int i = 0; i < code.length; i++) {
                if (i > 0) leftSum += code[i - 1];
                result[i] = leftSum;
                leftSum -= code[left];
                left = (++left) % code.length;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new P1652_DefuseTheBomb().decrypt(new int[]{5, 7, 1, 4}, 3)));
    }

}
