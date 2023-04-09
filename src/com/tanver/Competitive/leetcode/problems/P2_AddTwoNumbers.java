package com.tanver.Competitive.leetcode.problems;

public class P2_AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

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

        return sumHead;
    }

    public static void main(String[] args) {

    }

}
