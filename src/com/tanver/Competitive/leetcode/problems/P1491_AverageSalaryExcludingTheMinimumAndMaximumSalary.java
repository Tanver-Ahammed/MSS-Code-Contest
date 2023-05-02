package com.tanver.Competitive.leetcode.problems;

public class P1491_AverageSalaryExcludingTheMinimumAndMaximumSalary {

    public double average(int[] salary) {
        int max = salary[0];
        int min = salary[0];
        int sum = salary[0];
        for (int i = 1; i < salary.length; i++) {
            sum += salary[i];
            if (salary[i] > max)
                max = salary[i];
            if (salary[i] < min)
                min = salary[i];
        }
        return (double) (sum - min - max) / (salary.length - 2);
    }

    public static void main(String[] args) {
        System.out.println(new P1491_AverageSalaryExcludingTheMinimumAndMaximumSalary().average(
                new int[]{48000, 59000, 99000, 13000, 78000, 45000, 31000, 17000, 39000, 37000, 93000, 77000, 33000, 28000, 4000, 54000, 67000, 6000, 1000, 11000}
        ));
    }

}
