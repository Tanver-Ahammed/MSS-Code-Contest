package com.tanver;

@FunctionalInterface
interface Calculator {
    void add(int a, int b);
}

class Calc {
    public static void addSomething(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public void letsAdd(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}

@FunctionalInterface
interface Messenger {
    Message getMessage(String msg);
}

class Message {
    Message(String msg) {
        System.out.println(">>Message is: " + msg);
    }
}

public class Main {
    public static void main(String[] args) {

        Calc.addSomething(10, 20);

        // 1. Reference to static method
        Calculator methodReferenceStaticMethod = Calc::addSomething;
        methodReferenceStaticMethod.add(10, 25);

        // 2. Reference to non-static method
        Calc obj = new Calc();
        Calculator methodReferenceNonStaticMethod = obj::letsAdd;
        methodReferenceNonStaticMethod.add(25, 75);

        // 2. Reference to Constructor
        Messenger cRef = Message::new;
        cRef.getMessage("I am Tanver");

    }
}
