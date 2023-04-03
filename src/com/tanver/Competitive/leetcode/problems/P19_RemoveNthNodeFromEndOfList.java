package com.tanver.Competitive.leetcode.problems;

public class P19_RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = head;
        int len = 0;
        while (newHead != null) {
            ++len;
            newHead = newHead.next;
        }
        len = len - n;
        if (len == 0)
            return head.next;
        newHead = head;
        while (len > 1) {
            len--;
            newHead = newHead.next;
        }
        if (newHead.next != null) {
            newHead.next = newHead.next.next;
        } else {
            head = null;
        }
        return head;
    }

    public static void main(String[] args) {
        System.out.println();
    }

}
