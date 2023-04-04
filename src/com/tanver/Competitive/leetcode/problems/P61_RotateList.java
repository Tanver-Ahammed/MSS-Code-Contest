package com.tanver.Competitive.leetcode.problems;

public class P61_RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        ListNode current = head;
        int len = 1;
        while (current.next != null) {
            len++;
            current = current.next;
        }

        k = len - k % len;
        current.next = head;

        while (k-- > 0) {
            current = current.next;
        }
        head = current.next;
        current.next = null;
        return head;
    }

    public static void main(String[] args) {

    }

}
