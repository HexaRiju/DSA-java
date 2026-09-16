package com.java.DSA.LeetCodeDebugging;

public class Solution6 {
    // recursion solution with T.C O(2^n);
    public int rob(int[] nums) {
        return findMax(0,nums,0);
    }
    public int findMax(int max, int[] nums, int i){
        if(i >= nums.length){
            return max;
        }
        return Math.max(findMax(max + nums[i], nums, i+2),findMax(max, nums, i+1));
    }
    // dp solution with T.C O(n);
    public int findMax1(int i, int[] dp,int[] nums){
        if(i >= dp.length){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        dp[i] = Math.max(nums[i] + findMax1(i + 2,dp,nums),findMax1(i + 1,dp,nums));
        return dp[i];
    }
}


