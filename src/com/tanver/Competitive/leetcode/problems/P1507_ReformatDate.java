package com.tanver.Competitive.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class P1507_ReformatDate {

    public String reformatDate(String date) {
        Map<String, String> map = new HashMap<>();
        map.put("Jan", "01");
        map.put("Feb", "02");
        map.put("Mar", "03");
        map.put("Apr", "04");
        map.put("May", "05");
        map.put("Jun", "06");
        map.put("Jul", "07");
        map.put("Aug", "08");
        map.put("Sep", "09");
        map.put("Oct", "10");
        map.put("Nov", "11");
        map.put("Dec", "12");
        int len = date.length();
        StringBuilder sb = new StringBuilder(date.substring(len - 4) + "-");
        sb.append(map.get(date.substring(len - 8, len - 5))).append('-');
        if (Character.isDigit(date.charAt(1)))
            sb.append(date, 0, 2);
        else
            sb.append('0').append(date, 0, 1);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new P1507_ReformatDate().reformatDate("2th Oct 2052"));
    }

}
