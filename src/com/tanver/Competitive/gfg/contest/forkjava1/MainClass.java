package com.tanver.Competitive.gfg.contest.forkjava1;

public class MainClass {
    public static void main(String args[]) {
        int n = 10;
        int x = 9;
        int maxJump = n / 2;
        int jump = x / 2;
        int minJump = maxJump - jump;
        System.out.println(Math.min(jump, minJump));

    }
}