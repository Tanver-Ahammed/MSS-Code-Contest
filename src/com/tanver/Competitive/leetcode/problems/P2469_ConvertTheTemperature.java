package com.tanver.Competitive.leetcode.problems;

public class P2469_ConvertTheTemperature {

    public double[] convertTemperature(double celsius) {
        return new double[] {
                celsius + 273.15,
                celsius * 1.80 + 32.00
        };
    }

    public static void main(String[] args) {

    }

}
