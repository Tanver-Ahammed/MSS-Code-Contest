package com.tanver.Competitive.leetcode.problems;

public class P82_RemoveDuplicatesFromSortedListII {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode answer = new ListNode();
        answer.next = head;
        ListNode previous = answer;
        while (previous.next != null && previous.next.next != null) {
            if (previous.next.val == previous.next.next.val) {
                int value = previous.next.val;
                while (previous.next != null && previous.next.val == value) {
                    previous.next = previous.next.next;
                }
            } else
                previous = previous.next;
        }
        return answer.next;
    }

    public static void main(String[] args) {

    }

}
