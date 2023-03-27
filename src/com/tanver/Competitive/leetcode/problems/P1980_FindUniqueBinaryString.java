package com.tanver.Competitive.leetcode.problems;

import java.util.Stack;

public class P1980_FindUniqueBinaryString {

    public String findDifferentBinaryString(String[] nums) {
        Stack<String> stack = new Stack<>();
        int len = nums.length;
        for (int i = 0; i <= len; i++) {
            String bin, binAdd = "";
            bin = Integer.toBinaryString(i);
            int binLen = bin.length();
            int diff = len - binLen;
            for (int j = 0; j < diff; j++) {
                binAdd += "0";
            }
            String finalBin = binAdd + bin;
            stack.push(finalBin);
        }

        for (int i = 0; i < len; i++) {
            stack.removeElement(nums[i]);
        }
        return stack.peek();
    }


    public static void main(String[] args) {
        String[] nums = {"111", "011", "001"};
        P1980_FindUniqueBinaryString obj = new P1980_FindUniqueBinaryString();
        System.out.println(obj.findDifferentBinaryString(nums));
    }
}

