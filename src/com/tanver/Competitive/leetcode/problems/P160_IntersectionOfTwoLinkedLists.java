package com.tanver.Competitive.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class P160_IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;

        // 4,1,8,4,5
        // 5,6,1,8,4,5
        ListNode currA = headA;
        ListNode currB = headB;

        while (currA != currB) {
            currA = (currA == null) ? headB : currA.next;
            currB = (currB == null) ? headA : currB.next;
        }

        return currA;
    }

    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                return new int[]{map.get(temp), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }




}

