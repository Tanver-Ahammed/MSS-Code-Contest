package com.tanver.Competitive.gfg.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    static int majorityElement1(int a[], int n) {
        // your code here
        if (n == 1)
            return a[0];
        Arrays.sort(a);
        int counter = 1;
        for (int i = 1; i < n; i++) {
            if (a[i - 1] == a[i]) {
                ++counter;
                if (counter > n / 2)
                    return a[i];
            } else
                counter = 1;
        }
        return -1;
    }

    static int majorityElement2(int a[], int n) {
        // your code here
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : a)
            map.put(num, map.getOrDefault(num, 0) + 1);
        for (int key : map.keySet()) {
            if (map.get(key) > n / 2)
                return key;
        }
        return -1;
    }

    public int majorityElement3(int[] nums) {
        int count = 1;
        int major = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                count = 1;
                major = nums[i];
            } else if (major == nums[i])
                count++;
            else count--;
        }
        if (count > 1)
            return major;
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new MajorityElement().majorityElement3(new int[]{3, 3, 3, 3, 2, 2, 5}));
    }

}
