package com.java.DSA.LeetCodeDebugging;

import java.util.Arrays;

public class Solution10 {
    public int[] findRightInterval(int[][] intervals) {
        int[] ans = new int[intervals.length];
        Arrays.fill(ans, -1);
        for(int i = 0; i < intervals.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < intervals.length; j++) {
                if(i == j)
                    continue;
                if (intervals[j][0] >= intervals[i][1]){
                        int x = intervals[j][0];
                        if(x < min){
                            min = x;
                            ans[i] = j;
                        }
                    }
            }
        }
        return ans;
    }
}
