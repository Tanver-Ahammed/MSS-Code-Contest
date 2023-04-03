package com.tanver.Competitive.leetcode.problems;

public class P1290_ConvertBinaryNumberInALinkedListToInteger {

    public int getDecimalValue(ListNode head) {
        int decmalValue = 0;
        while (head != null) {
            decmalValue *= 2;
            decmalValue += head.val;
            head = head.next;
        }
        return decmalValue;
    }

    public static void main(String[] args) {

    }

}
