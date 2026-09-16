package com.java.DSA.LeetCodeDebugging;

import java.util.*;
public class Solution26 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        int result = 0;
        for(int i = 0; i < nums.length - 2; i++){
            int j = i+1, k = nums.length - 1;
            while(j < k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == target){
                    return target;
                }
                else if(sum > target){
                    if(minDiff > sum - target){
                        result = sum;
                        minDiff = Math.min(minDiff,sum - target);
                    }
                    k--;
                }
                else{
                    if(minDiff > target - sum){
                        result = sum;
                        minDiff = Math.min(minDiff,target - sum);
                    }
                    j++;
                }
            }
        }
        return result;
    }
}
