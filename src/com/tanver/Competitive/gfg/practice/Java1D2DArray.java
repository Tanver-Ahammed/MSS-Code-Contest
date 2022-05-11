package com.tanver.Competitive.gfg.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Java1D2DArray {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        int sum = 0;
        ArrayList<Integer> ans = new ArrayList<>(2);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    sum += a[i][j];
            }
        }
        Arrays.sort(b);
        ans.add(sum);
        ans.add(b[n - 1]);
        return ans;
    }

    public static void main(String[] args) {
        int[][] a = {{1,2}, {1, 2}};
        int[] b = {10, 9};
        ArrayList<Integer> ans = array(a, b, 2);

        for (int i : ans) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
