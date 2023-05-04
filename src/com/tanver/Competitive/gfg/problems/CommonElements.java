package com.tanver.Competitive.gfg.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CommonElements {

    ArrayList<Integer> commonElements1(int A[], int B[], int C[], int n1, int n2, int n3) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : A)
            map.put(num, 1);
        map.put(B[0], map.getOrDefault(B[0], 0) + 1);
        for (int i = 1; i < B.length; i++) {
            if (B[i - 1] == B[i])
                continue;
            map.put(B[i], map.getOrDefault(B[i], 0) + 1);
        }
        map.put(C[0], map.getOrDefault(C[0], 0) + 1);
        for (int i = 1; i < C.length; i++) {
            if (C[i - 1] == C[i])
                continue;
            map.put(C[i], map.getOrDefault(C[i], 0) + 1);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == 3)
                result.add(key);
        }
        return result;
    }

    ArrayList<Integer> commonElements2(int[] A, int[] B, int[] C, int n1, int n2, int n3) {
        int i = 0, j = 0, k = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while (i < n1 && j < n2 && k < n3) {
            if (A[i] == B[j] && B[j] == C[k]) {
                result.add(A[i]);
                i++;
                j++;
                k++;
            } else if (A[i] < B[j]) i++;
            else if (B[j] < C[k]) j++;
            else k++;

            while (i > 0 && i < n1 && A[i] == A[i - 1]) i++;
            while (j > 0 && j < n2 && B[j] == B[j - 1]) j++;
            while (k > 0 && k < n3 && C[k] == C[k - 1]) k++;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] A = new int[]{1, 2, 3, 4, 5};
        int[] B = new int[]{2, 3, 3, 3, 5};
        int[] C = new int[]{1, 2, 3, 4, 5};
        System.out.println(new CommonElements().commonElements1(A, B, C, 5, 5, 5));
        System.out.println(new CommonElements().commonElements2(A, B, C, 5, 5, 5));
    }

}
