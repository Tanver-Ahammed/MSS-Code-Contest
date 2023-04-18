package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class P1431_KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        for (int candy : candies) {
            if (candy > max)
                max = candy;
        }
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies)
            result.add(candy + extraCandies < max);
        return result;
    }

}
