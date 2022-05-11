package com.tanver.Competitive.hackerrank.practice.java;

import java.util.Scanner;

abstract class Book {

    String title;

    String getTitle() {
        return title;
    }

    abstract void setTitle(String s);

}

//Write MyBook class here
class MyBook extends Book {

    @Override
    String getTitle() {
        return title;
    }

    @Override
    void setTitle(String s) {
        this.title = s;
    }
}

public class JavaAbstractClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: " + new_novel.getTitle());
        sc.close();

    }
}