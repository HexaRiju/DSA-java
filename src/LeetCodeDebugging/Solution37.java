package com.java.DSA.LeetCodeDebugging;

public class Solution37 {
    public boolean canJump(int[] nums) {
        int maxReach = Integer.MIN_VALUE;
        int reachAble = nums.length - 1;
        int i = 0;
        while (i < nums.length) {
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= reachAble)
                return true;
            else if (nums[i] == 0 && maxReach == i + nums[i])
                return false;
            else
                i++;
        }
        return true;
    }
}
