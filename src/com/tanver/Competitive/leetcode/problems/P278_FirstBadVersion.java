package com.tanver.Competitive.leetcode.problems;

class VersionControl {
    // it is an API. It's developed by leetcode
    public boolean isBadVersion(int version) {
        return true;
    }
}

public class P278_FirstBadVersion extends VersionControl {

    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid))
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }


}
