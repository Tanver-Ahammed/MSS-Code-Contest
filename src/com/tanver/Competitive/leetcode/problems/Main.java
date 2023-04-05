package com.tanver.Competitive.leetcode.problems;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {


    public String[] getFolderNames(String[] names) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            int count = map.getOrDefault(name, 0);
            while (map.containsKey(name))
                name = names[i] + "(" + ++count + ")";
            map.put(name, 0);
            map.put(names[i], count);
            names[i] = name;
        }
        return names;
    }

    public static void main(String[] args) {

//        String st = "get(1)";
//        System.out.println(st.substring(0, st.length() - 3));
//
//        String[] names = new String[]{"gta", "gta(1)", "gta", "gta", "gta(1)", "gta", "avalon"};
//        System.out.println(Arrays.toString(names));
//        System.out.println(Arrays.toString(new Main().getFolderNames(names)));
        System.out.println(new Main().reverseBits(654615212));
    }

    public int reverseBits(int n) {
        String binary = Integer.toBinaryString(n);
        binary = new StringBuilder(binary).reverse().toString();
        return (int) Long.parseLong(binary, 2);
    }

}