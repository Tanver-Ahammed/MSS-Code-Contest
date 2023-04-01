package com.tanver.Competitive.leetcode.problems;

public class P551_StudentAttendanceRecordI {

    public boolean checkRecord(String s) {
        int absent = 0;
        int late = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'A') {
                ++absent;
                late = 0;
            } else if (ch == 'L') {
                ++late;
                if (late >= 3)
                    return false;
            } else
                late = 0;
        }
        return absent < 2;

    }

    public static void main(String[] args) {

    }

}
