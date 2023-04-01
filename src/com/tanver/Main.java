package com.tanver;

public class Main {

    public int thirdMax(int[] nums) {
        Integer first = null;
        Integer second = null;
        Integer third = null;
        for (Integer num : nums) {
            if (num.equals(first) || num.equals(second) || num.equals(third))
                continue;
            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            } else if (second == null || num > second) {
                third = second;
                second = num;
            } else if (third == null || num > third) {
                third = num;
            }
        }
        return third == null ? first : third;
    }

    public static void main(String[] args) {
        System.out.println(new Main().thirdMax(new int[]{2, 2, 2, 1}));
        System.out.println(new Main().thirdMax(new int[]{1, 2, 2, 5, 3, 5}));
        System.out.println(new Main().thirdMax(new int[]{1, 2}));
        System.out.println(new Main().thirdMax(new int[]{2, 2, 3, 1}));
        System.out.println(new Main().thirdMax(new int[]{2, 2, 2}));
        System.out.println(new Main().thirdMax(new int[]{2}));
        System.out.println(new Main().thirdMax(new int[]{2, 2}));
        System.out.println(new Main().thirdMax(new int[]{1, 1, 2}));
        System.out.println(new Main().thirdMax(new int[]{3, 2, 2}));
        System.out.println(new Main().thirdMax(new int[]{1, 2, -2147483648}));
    }

}
