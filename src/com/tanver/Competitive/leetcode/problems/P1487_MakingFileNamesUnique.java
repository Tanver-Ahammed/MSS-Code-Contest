package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P1487_MakingFileNamesUnique {

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
        String[] names = new String[]{"gta", "gta(1)", "gta", "gta", "gta(1)", "gta", "avalon"};
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(new P1487_MakingFileNamesUnique().getFolderNames(names)));
    }
}
