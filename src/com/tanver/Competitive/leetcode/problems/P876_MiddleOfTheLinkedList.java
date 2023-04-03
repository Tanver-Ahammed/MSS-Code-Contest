package com.tanver.Competitive.leetcode.problems;

public class P876_MiddleOfTheLinkedList {

    public ListNode middleNode1(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            ++len;
            temp = temp.next;
        }
        len = len / 2;
        while (len-- > 0) {
            head = head.next;
        }
        return head;
    }

    public ListNode middleNode2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {

    }

}
