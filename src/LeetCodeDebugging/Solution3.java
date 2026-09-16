package com.java.DSA.LeetCodeDebugging;

public class Solution3 {
    public boolean canJump(int[] nums) {
        int jump = 0;
        while(jump < nums.length - 1){
            int j = jump;
            jump += nums[jump];
            if(j == jump)
                return false;
        }
        if(jump > nums.length - 1)
            return false;
        return true;
    }
}
