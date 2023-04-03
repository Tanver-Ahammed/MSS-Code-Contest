package com.tanver.Competitive.leetcode.problems;

public class P24_SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        ListNode newHead = head;
        while (newHead != null) {

            if (newHead.next != null) {
                int temp = newHead.val;
                newHead.val = newHead.next.val;
                newHead.next.val = temp;
            }
            newHead = newHead.next;
            if (newHead != null)
                newHead = newHead.next;
        }
        return head;
    }

    public static void main(String[] args) {
        System.out.println();
    }

}
