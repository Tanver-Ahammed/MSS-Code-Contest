package com.tanver.Competitive.leetcode.problems;

public class P83_RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
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

    public static void main(String[] args) {

    }

}
