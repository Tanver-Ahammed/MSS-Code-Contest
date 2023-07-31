package com.tanver.study.hasib;


import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("C");
        list.remove("C++");
        list.add("C++");
        System.out.println(list);
    }
}

class B {
    int x = 2;

    int me() {
        return x;
    }
}

class sub extends B {
    int x = 3;

    int me() {
        return x;
    }
}