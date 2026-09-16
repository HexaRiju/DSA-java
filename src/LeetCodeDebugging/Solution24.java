package com.java.DSA.LeetCodeDebugging;

public class Solution24 {
    public int specialArray(int[] nums) {
        int[] freq = new int[1001];
        for(int i = 0; i < nums.length; i++){
            freq[nums[i]]++;
        }
        int exact = 0, count = 0;
        for(int i = 0; i <= nums.length; i++){
            exact = i;
            for(int j = i; j < freq.length; j++){
                if(j >= i && freq[j] != 0)
                    count += freq[j];
            }
            if(exact == count)
                return i;
            count = 0;
        }
        return -1;
    }
}
