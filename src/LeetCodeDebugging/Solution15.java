package com.java.DSA.LeetCodeDebugging;

import java.util.Arrays;

public class Solution15 {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
         int left = 0, right = 0;
         long total = 0, result = 0;
         while(right < nums.length){
             total += nums[right];
             while(nums[right]*(right-left+1)> total + k){
                 total -= nums[left];
                 left++;
             }
             result = Math.max(result, right-left+1);
             right++;
         }
         return (int)result;
    }
}
