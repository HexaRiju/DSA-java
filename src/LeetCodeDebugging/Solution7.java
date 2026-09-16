package com.java.DSA.LeetCodeDebugging;

import java.util.Arrays;

public class Solution7 {
        public boolean canJump(int[] nums) {
            Boolean[] dp = new Boolean[nums.length];// here instide of using primitive i use  Boolean as i need three state true,false, null , but in simple boolean i have only two state false and true
            Arrays.fill(dp,null);
            return validJump(0,dp,nums);
        }
        public boolean validJump(int i, Boolean[] dp, int[] nums) {
            if (i == nums.length - 1) {
                return true;
            }
            if (i >= nums.length)
                return false;
            if (dp[i] != null) {
                return dp[i];
            }
            dp[i] = false;
            for(int j = 1; j <= nums[i]; j++){
                dp[i] = validJump(i+j,dp,nums) || dp[i];
            }
            return dp[i];
        }
}
