package com.java.DSA.LeetCodeDebugging;

import java.util.Arrays;

public class Solution27 {
    public String largestNumber(int[] nums) {
        String[] s = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            s[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(s,(a, b) ->{
            return (b+a).compareTo(a+b);
        });
        String x = "";
        for(int i = 0; i < s.length; i++){
            x += s[i];
        }
        return x;
    }
}
