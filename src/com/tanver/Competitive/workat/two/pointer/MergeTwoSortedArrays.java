package com.tanver.Competitive.workat.two.pointer;

public class MergeTwoSortedArrays {


    int[] mergeSortedArrays(int[] A, int[] B) {
        // add your logic here
        int lenA = A.length;
        int lenB = B.length;
        int[] mergeArr = new int[lenA + lenB];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < lenA && j < lenB) {
            if (A[i] < B[j])
                mergeArr[k++] = A[i++];
            else
                mergeArr[k++] = A[j++];
        }
        while (i < lenA)
            mergeArr[k++] = A[i++];
        while (j < lenB)
            mergeArr[k++] = B[j++];
        return mergeArr;
    }

    public static void main(String[] args) {

    }

}
