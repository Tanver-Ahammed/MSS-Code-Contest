package com.tanver;

class Parent {
    {
        System.out.println("Parent class init block 1-5"); //5
    }

    static {
        System.out.println("Parent class static block 1-1"); // 1
    }

    public Parent() {
        System.out.println("Parent Constructor called-7");
    }

    {
        System.out.println("Parent class init block 2-6");
    }

    static {
        System.out.println("Parent class static block 1-2"); //2
    }
}

class Child extends Parent {
    {
        System.out.println("Child class init block 1-8");
    }

    static {
        System.out.println("Child class static block 1-3"); //3
    }

    public Child() {
        System.out.println("Child Constructor called-10");
    }

    {
        System.out.println("Child class init block 2-9");
    }

    static {
        System.out.println("Child class static block 1-4"); //4
    }
}

public class InitBlockTest {
    public static void main(String[] args) {
        new Child();
    }
}