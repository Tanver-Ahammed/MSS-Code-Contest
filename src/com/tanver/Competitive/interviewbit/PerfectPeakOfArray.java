package com.tanver.Competitive.interviewbit;

import java.util.ArrayList;
import java.util.List;

public class PerfectPeakOfArray {
    public int perfectPeak(ArrayList<Integer> A) {
        int len = A.size();
        for (int i = 1; i < len - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if (A.get(j) >= A.get(i)) {
                    flag = false;
                    break;
                }
            }
            for (int k = i + 1; k < len; k++) {
                if (A.get(k) <= A.get(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(9488, 25784, 5652,
                9861, 31311, 8611, 1671, 7129, 28183, 2743, 11059, 4473, 7927, 21287, 2259, 7214, 32529));
        System.out.println(new PerfectPeakOfArray().perfectPeak(list));
    }

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        int len = a.size();
        for (int i = 0; i < len / 2; i++) {
            int temp = a.get(i);
            a.set(i, a.get(len - 1 - i));
            a.set(len - 1 - i, temp);
        }
        return a;
    }

}
