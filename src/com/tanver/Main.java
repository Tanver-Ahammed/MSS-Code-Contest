package com.tanver;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int up = n / 2;
        if (n % 2 == 1)
            up++;
        int down = n / 2;
        System.out.println(up * 3 - down * 1.2);
    }

    public int maxp3(ArrayList<Integer> A) {
        Collections.sort(A);
        int index = A.size() - 1;
        int val1 = A.get(index) * A.get(index - 1) * A.get(index - 2);
        int val2 = A.get(index) * A.get(0) * A.get(1);
        return Math.max(val1, val2);
    }

}
