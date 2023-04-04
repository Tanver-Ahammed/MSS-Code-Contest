package com.tanver.Competitive.leetcode.problems;

public class P38_CountAndSay {

    public String countAndSay(int n) {
        if (n == 1)
            return "1";
        else if (n == 2)
            return "11";
        String result = "11";
        for (int i = 2; i < n; i++) {
            StringBuilder temp = new StringBuilder();
            int count = 1;
            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j - 1) == result.charAt(j)) {
                    ++count;
                } else {
                    temp.append(count).append(result.charAt(j - 1));
                    count = 1;
                }
            }
            result = String.valueOf(temp.append(count).append(result.charAt(result.length() - 1)));
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(new P38_CountAndSay().countAndSay(3));
        System.out.println(new P38_CountAndSay().countAndSay(4));
        System.out.println(new P38_CountAndSay().countAndSay(5));
        System.out.println(new P38_CountAndSay().countAndSay(70));
    }

}
