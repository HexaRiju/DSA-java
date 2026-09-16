package com.java.DSA.LeetCodeDebugging;

public class Solution9 {
    public int findMin(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while(i <= j){
            int mid = i + (j -i)/2;
            if(mid == 0){
                return nums[1];
            }
            else if(mid == nums.length - 1){
                return nums[0];
            }
            else if(nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]){
                return nums[mid + 1];
            }
            else if(nums[mid] >= nums[i]){
                i = mid + 1;
            }
            else{
                j = mid - 1;
            }
        }
        return nums[0];
    }
}
