package com.tanver.Competitive.leetcode.problems;

public class P203_RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val)
            head = head.next;
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.next.val == val)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }
        return head;
    }

    public ListNode removeElements1(ListNode head, int val) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode current = dummy;
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else
                current = current.next;
        }
        return dummy.next;
    }

    public ListNode removeElements2(ListNode head, int val) {
        if (head == null)
            return null;
        head.next = removeElements2(head.next, val);
        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {

    }

}
