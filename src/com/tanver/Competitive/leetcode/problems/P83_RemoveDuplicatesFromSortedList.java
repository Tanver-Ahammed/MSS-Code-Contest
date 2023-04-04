package com.tanver.Competitive.leetcode.problems;

public class P83_RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates1(ListNode head) {
        ListNode result = new ListNode(0);
        ListNode current = result;
        int prev = -101;
        // [1,1,2,3,3]
        while (head != null) {
            if (head.val == prev) {
                head = head.next;
                continue;
            }
            prev = head.val;
            current.next = head;
            head = head.next;
            current = current.next;
            current.next = null;
        }
        return result.next;
    }

    public ListNode deleteDuplicates2(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
                continue;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {

    }

}
