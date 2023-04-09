package com.tanver.Competitive.leetcode.problems;

public class P445_AddTwoNumbersII {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseList(l1);
        l2 = reverseList(l2);

        ListNode sumHead = new ListNode();
        int iteration = 0;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            if (sum > 9)
                sum = sum - 10;

            if (iteration == 0)
                sumHead = new ListNode(sum);
            else {
                ListNode node = new ListNode(sum);

                ListNode new_Node = sumHead;
                while (new_Node.next != null)
                    new_Node = new_Node.next;
                new_Node.next = node;
            }
            ++iteration;
        }
        if (carry > 0) {
            ListNode node = new ListNode(carry);
            ListNode new_Node = sumHead;
            while (new_Node.next != null)
                new_Node = new_Node.next;
            new_Node.next = node;
        }

        return reverseList(sumHead);

    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    public static void main(String[] args) {

    }

}
