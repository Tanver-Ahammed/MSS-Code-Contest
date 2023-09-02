package com.tanver.Competitive.ostad.app.stack.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class SchoolCafeteria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 1; i <= testCase; i++) {
            Queue<String> studentChoice = new LinkedList<>();
            Stack<String> food = new Stack<>();
            int n = scanner.nextInt();
            int counter = 0;
            for (int j = 0; j < n; j++) {
                int type = scanner.nextInt();
                if (type == 1)
                    studentChoice.add(scanner.next());
                else if (type == 2)
                    food.push(scanner.next());
                else {
                    if (studentChoice.isEmpty())
                        continue;
                    String temp = studentChoice.remove();
                    if (food.isEmpty() || !temp.equals(food.peek()))
                        studentChoice.add(temp);
                    else {
                        ++counter;
                        food.pop();
                    }
                }
            }
            System.out.println("Day " + i + ": " + counter);
        }
    }

}

//    private static int numOfSatisfiedStudents(int n) {
//        Queue<String> studentChoice = new LinkedList<>();
//        Stack<String> food = new Stack<>();
//        int counter = 0;
//        for (int i = 0; i < n; i++) {
//            int type = scanner.nextInt();
//            if (type == 1)
//                studentChoice.add(scanner.next());
//            else if (type == 2)
//                food.push(scanner.next());
//            else {
//                if (studentChoice.isEmpty())
//                    continue;
//                String temp = studentChoice.remove();
//                if (food.isEmpty() || !temp.equals(food.peek()))
//                    studentChoice.add(temp);
//                else {
//                    ++counter;
//                    food.pop();
//                }
//            }
//        }
//        return counter;
//    }
