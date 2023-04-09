package com.tanver.Competitive.leetcode.problems;

import java.util.Random;

class Solution {

    private ListNode head;
    private Random random;

    public Solution(ListNode head) {
        this.head = head;
        this.random = new Random();
    }

    public int getRandom() {
        ListNode node = head;
        int result = 0;
        int inc = 3;
        if (node != null)
            result = node.val;
        while (node != null) {
            ++inc;
            if (this.random.nextInt(inc) == 0)
                result = node.val;
            node = node.next;
        }
        return result;
    }

}

public class P382_LinkedListRandomNode {

    public static void main(String[] args) {

    }

}
