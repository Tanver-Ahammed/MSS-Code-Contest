package com.tanver.Competitive.leetcode.problems;

public class P86_PartitionList {

    public ListNode partition(ListNode head, int x) {
        ListNode before = new ListNode();
        ListNode after = new ListNode();
        ListNode beforeStore = before;
        ListNode afterStore = after;
        while (head != null) {
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        before.next = afterStore.next;
        return beforeStore.next;
    }

    public static void main(String[] args) {

    }

}
