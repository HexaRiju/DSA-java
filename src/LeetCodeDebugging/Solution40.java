package com.java.DSA.LeetCodeDebugging;

public class Solution40 {
    public int[] productExceptSelf(int[] nums) {
        int[] suffixMul = new int[nums.length];
        int[] prefixMul = new int[nums.length];
        suffixMul[0] = 1;
        prefixMul[nums.length - 1] = 1;
        for(int i = 1; i < nums.length; i++){
            suffixMul[i] = suffixMul[i - 1]*nums[i - 1];
        }
        for(int i = nums.length - 2; i >= 0; i--){
            prefixMul[i] = prefixMul[i + 1]*nums[i + 1];
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = suffixMul[i]*prefixMul[i];
        }
        return nums;
    }
}
