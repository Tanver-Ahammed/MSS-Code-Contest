package com.tanver.Competitive.ostad.app.recursion;

public class Print1To10 {

    private void print1To10(int n) {
        if (n <= 0)
            return;
        print1To10(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Print1To10 obj = new Print1To10();
        obj.print1To10(10);

    }

}
