package com.tanver.Competitive.leetcode.problems;

public class P1598_CrawlerLogFolder {

    public int minOperations(String[] logs) {
        int counter = 0;
        for (String log : logs) {
            if (log.equals("../") && counter > 0)
                --counter;
            else if (log.charAt(0) != '.')
                ++counter;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(new P1598_CrawlerLogFolder().minOperations(new String[]{"d1/", "d2/", "../", "d21/", "./"}));
        System.out.println(new P1598_CrawlerLogFolder().minOperations(new String[]{"d1/", "d2/", "./", "d3/", "../", "d31/"}));
        System.out.println(new P1598_CrawlerLogFolder().minOperations(new String[]{"d1/", "../", "../", "../"}));
        System.out.println(new P1598_CrawlerLogFolder().minOperations(new String[]{"1/"}));
    }

}
